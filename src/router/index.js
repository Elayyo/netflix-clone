import Vue from "vue";
import VueRouter from "vue-router";
import NLogin from "@/views/NLogin.vue";
import NProfile from "@/views/NProfile.vue";

Vue.use(VueRouter);

const routes = [
  {
    path: "/",
    name: "Login",
    component: NLogin,
  },
  {
    path: "/profile",
    name: "Profile",
    component: NProfile,
  },
];

const router = new VueRouter({
  routes,
});

export default router;
