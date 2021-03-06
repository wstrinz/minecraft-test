(ns yoshiquest.test-mod.client
  (:require
   [forge-clj.client.registry :refer [bind-tile-renderer]]
   [yoshiquest.test-mod.tileentities :refer [render-block-entity test-model-entity]]
   [yoshiquest.test-mod.client.ui :refer [init-client-gui]]
   [yoshiquest.test-mod.client.renderers.render-block-renderer :refer [render-block-tile-renderer]]
   [yoshiquest.test-mod.client.renderers.test-model-renderer :refer [test-model-tile-renderer]]))

(defn client-init [this event]
  (init-client-gui)
  (bind-tile-renderer render-block-entity render-block-tile-renderer)
  (bind-tile-renderer test-model-entity test-model-tile-renderer))
