(defproject ring "0.2.5-l0st3d"
  :description "A Clojure web applications library."
  :url "http://github.com/mmcgrana/ring"
  :dependencies
    [[ring/ring-core "0.2.5"]
     [ring/ring-devel "0.2.5"]
     [ring/ring-httpcore-adapter "0.2.5"]
     [ring/ring-jetty-adapter "0.2.5"]
     [ring/ring-servlet "0.2.5"]]
  :dev-dependencies
    [[autodoc "0.7.0"]
     [lein-clojars "0.5.0"]]
  :autodoc
    {:name "Ring"
     :description "A Clojure web applications library"
     :copyright "Copyright 2009-2010 Mark McGranaghan"
     :root "."
     :source-path ""
     :web-src-dir "http://github.com/mmcgrana/ring/blob/"
     :web-home "http://mmcgrana.github.com/ring/"
     :output-path "autodoc"
     :namespaces-to-document ["ring"]
     :trim-prefix "ring."
     :load-except-list [#"/example/" #"/test/" #"project\.clj"]})
