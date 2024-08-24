/** @type {import('tailwindcss').Config} */
import withMT from "@material-tailwind/html/utils/withMT";

module.exports = withMT({
  content: ["./public/**/*.html", "./src/**/*.{vue,js,ts,jsx,tsx}"],
  theme: {
    extend: {
      backgroundImage: {
        "hero-image": "url('/public/images/hero.jpg')",
        "logo-image": "url('/public/images/logo.png')",
      },
    },
  },
  plugins: [],
});
