(ns repl)

(use 'figwheel-sidecar.repl-api)
;; fetches configuration
(start-figwheel!)
(cljs-repl)