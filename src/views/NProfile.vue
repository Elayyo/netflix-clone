<template>
  <div>
    <div class="absolute w-full h-full bg-gray-900 -z-10"></div>
    <h1
      class="text-white font-semibold text-6xl"
      :style="{ 'padding-top': '10vh' }"
    >
      Who's watching?
    </h1>
    <div class="flex justify-center items-center flex-col">
      <button id="Profilbild">
        <img
          class="w-40 h-40 m-10"
          src="../../public/images/default-blue.png"
          alt="Profilbild"
        />
      </button>
      <label class="font-semibold text-white" for="Profilbild">Kek</label>
    </div>
  </div>
</template>

<script>
export default {};
</script>
