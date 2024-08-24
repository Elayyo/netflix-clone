<template>
  <div id="app">
    <n-authentication></n-authentication>
  </div>
</template>

<script>
import NAuthentication from "./components/NAuthentication.vue";

export default {
  name: "App",
  components: {
    NAuthentication,
  },
};
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
}

body,
html {
  height: 100%;
}
</style>
