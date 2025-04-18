<template>
  <div class="relative">
    <div
      class="absolute bg-hero-image w-full h-screen bg-no-repeat bg-cover overflow-hidden brightness-75 -z-10 bg-fixed"
    ></div>
    <header class="px-40 py-10">
      <img src="../../public/images/logo.png" alt="Netflix Logo" class="h-20" />
    </header>
    <div
      class="flex items-center flex-col bg-black bg-opacity-80 rounded-lg min-w"
      :style="{
        'margin-left': '40vw',
        'margin-right': '40vw',
        'padding-top': '25px',
        'padding-bottom': '50px',
      }"
      :class="{hide: hideRegistration}"
    >
      <h2
        class="text-white self-start px-10 py-5 text-4xl font-semibold brightness-100"
      >
        Einloggen
      </h2>
      <form>
        <n-base-input-field :placeholder="'Email oder Username'" :mt="1" :mb="1"></n-base-input-field>
        <n-base-input-field :placeholder="'Passwort'" :mb="1"></n-base-input-field>
        <button
          @click="sendRequest"
          type="submit"
          data-ripple-light="true"
          class="w-72 align-middle select-none font-sans font-bold text-center uppercase transition-all disabled:opacity-50 disabled:shadow-none disabled:pointer-events-none text-xs py-3 px-6 rounded-lg bg-red-700 text-white shadow-md shadow-gray-900/10 hover:shadow-lg hover:shadow-gray-900/20 focus:opacity-[0.85] focus:shadow-none active:opacity-[0.85] active:shadow-none"
        >
          Anmelden
        </button>
      </form>
      <div class="mt-4">
        <span class="text-gray-600 p">Noch keinen Account? </span>
        <button class="text-white" @click=" hideRegistration = !hideRegistration">Jetzt registrieren</button>
      </div>
    </div>
    <n-registration :class="{hide:!hideRegistration}" @setFlag="hideRegistration = !hideRegistration"></n-registration>
  </div>
</template>

<script>
import NRegistration from "@/components/NRegistration.vue";
import NBaseInputField from "@/components/NBaseInputField.vue";
export default {
  components: {
    NRegistration,
    NBaseInputField,
  },
  data: function () {
    return {
      hideRegistration: false
    }
  },
  methods: {
    async sendRequest(){
      const url = "http://localhost:8080/api/greetings";
      try {
        const response = await fetch(url,{
          "headers": {
            "Authorization": "Basic " + btoa("john:fun123")
          }
        });
        if (!response.ok) {
          throw new Error(`Response status: ${response.status}`);
        }

        const json = await response.json();
        console.log(json);
      } catch (error) {
        console.error(error.message);
      }
    }
  }
};
</script>

<style scoped>
  .hide{
    display: none;
  }
</style>
