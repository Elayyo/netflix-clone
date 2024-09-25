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
<!--      maybe input feld und button als eigene komponente umso den code schlanker zu halten !!!!!!-->
      <div class="w-72 my-4">
        <div class="relative w-full min-w-[200px] h-10">
          <input
            type="email"
            class="peer w-full h-full bg-transparent text-white font-sans font-normal outline outline-0 focus:outline-0 disabled:bg-blue-gray-50 disabled:border-0 transition-all placeholder-shown:border placeholder-shown:border-gray-600 placeholder-shown:border-t-gray-600 border focus:border-2 border-t-transparent focus:border-t-transparent text-sm px-3 py-2.5 rounded-[7px] border-gray-600 focus:border-white"
            placeholder=" "
          /><label
            class="flex w-full h-full select-none pointer-events-none absolute left-0 font-normal !overflow-visible truncate peer-placeholder-shown:text-gray-600 leading-tight peer-focus:leading-tight peer-disabled:text-transparent peer-disabled:peer-placeholder-shown:text-gray-600 transition-all -top-1.5 peer-placeholder-shown:text-sm text-[11px] peer-focus:text-[11px] before:content[' '] before:block before:box-border before:w-2.5 before:h-1.5 before:mt-[6.5px] before:mr-1 peer-placeholder-shown:before:border-transparent before:rounded-tl-md before:border-t peer-focus:before:border-t-2 before:border-l peer-focus:before:border-l-2 before:pointer-events-none before:transition-all peer-disabled:before:border-transparent after:content[' '] after:block after:flex-grow after:box-border after:w-2.5 after:h-1.5 after:mt-[6.5px] after:ml-1 peer-placeholder-shown:after:border-transparent after:rounded-tr-md after:border-t peer-focus:after:border-t-2 after:border-r peer-focus:after:border-r-2 after:pointer-events-none after:transition-all peer-disabled:after:border-transparent peer-placeholder-shown:leading-[3.75] text-gray-600 peer-focus:text-white before:border-blue-gray-200 peer-focus:before:border-white after:border-gray-600 peer-focus:after:border-white"
            >Benutzername oder Email
          </label>
        </div>
      </div>
      <div class="w-72 mb-4">
        <div class="relative w-full min-w-[200px] h-10">
          <input
            type="password"
            class="peer w-full h-full bg-transparent text-white font-sans font-normal outline outline-0 focus:outline-0 disabled:bg-blue-gray-50 disabled:border-0 transition-all placeholder-shown:border placeholder-shown:border-gray-600 placeholder-shown:border-t-gray-600 border focus:border-2 border-t-transparent focus:border-t-transparent text-sm px-3 py-2.5 rounded-[7px] border-gray-600 focus:border-white"
            placeholder=" "
          /><label
            class="flex w-full h-full select-none pointer-events-none absolute left-0 font-normal !overflow-visible truncate peer-placeholder-shown:text-gray-600 leading-tight peer-focus:leading-tight peer-disabled:text-transparent peer-disabled:peer-placeholder-shown:text-gray-600 transition-all -top-1.5 peer-placeholder-shown:text-sm text-[11px] peer-focus:text-[11px] before:content[' '] before:block before:box-border before:w-2.5 before:h-1.5 before:mt-[6.5px] before:mr-1 peer-placeholder-shown:before:border-transparent before:rounded-tl-md before:border-t peer-focus:before:border-t-2 before:border-l peer-focus:before:border-l-2 before:pointer-events-none before:transition-all peer-disabled:before:border-transparent after:content[' '] after:block after:flex-grow after:box-border after:w-2.5 after:h-1.5 after:mt-[6.5px] after:ml-1 peer-placeholder-shown:after:border-transparent after:rounded-tr-md after:border-t peer-focus:after:border-t-2 after:border-r peer-focus:after:border-r-2 after:pointer-events-none after:transition-all peer-disabled:after:border-transparent peer-placeholder-shown:leading-[3.75] text-gray-600 peer-focus:text-white before:border-blue-gray-200 peer-focus:before:border-white after:border-gray-600 peer-focus:after:border-white"
            >Passwort
          </label>

        </div>
      </div>
      <button
        type="button"
        data-ripple-light="true"
        class="w-72 align-middle select-none font-sans font-bold text-center uppercase transition-all disabled:opacity-50 disabled:shadow-none disabled:pointer-events-none text-xs py-3 px-6 rounded-lg bg-red-700 text-white shadow-md shadow-gray-900/10 hover:shadow-lg hover:shadow-gray-900/20 focus:opacity-[0.85] focus:shadow-none active:opacity-[0.85] active:shadow-none"
      >
        Anmelden
      </button>
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
export default {
  components: {
    NRegistration
  },
  data: function () {
    return {
      hideRegistration: false
    }
  }
};
</script>

<style scoped>
  .hide{
    display: none;
  }
</style>
