(defproject thinktopic/cortex "0.1.0-SNAPSHOT"
  :description "A neural network toolkit for ThinkTopic projects."
  :dependencies [[org.clojure/clojure "1.8.0-RC1"]
                 [com.taoensso/timbre "4.1.4"]
                 [net.mikera/vectorz-clj "0.37.0"]]

  :jvm-opts  ["-Xmx8g"
              "-XX:+UseConcMarkSweepGC"
              "-XX:-OmitStackTraceInFastThrow"])
