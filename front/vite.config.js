import { defineConfig } from 'vite'
import { resolve as resolvePath } from 'path'
import scalaJSPlugin from "@scala-js/vite-plugin-scalajs"

export default defineConfig({
  plugins: [scalaJSPlugin({
    cwd: "../"
  })],
  resolve: {
    alias: {
      "@": resolvePath(__dirname, "./src"),
      "#": resolvePath(__dirname),
      "~": resolvePath(__dirname, "./src/main/resources")
    }
  }
})