(ns proton.layers.tools.minimap.core
  (:use [proton.layers.base :only [init-layer! get-initial-config get-keybindings get-packages get-keymaps]]))

(defmethod init-layer! :tools/minimap
  [_ config]
  (println "init minimap"))

(defmethod get-keybindings :tools/minimap
  []
  {:t {:category "toggles"
       :m {:action "minimap:toggle"
           :title "minimap"}}})

(defmethod get-packages :tools/minimap
  []
  [:minimap])

(defmethod get-keymaps :tools/minimap [] [])
(defmethod get-initial-config :tools/minimap [] [])
