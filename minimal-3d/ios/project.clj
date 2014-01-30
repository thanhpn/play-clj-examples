(defproject minimal-3d "0.0.1-SNAPSHOT"
  :description "FIXME: write description"
  :dependencies [[com.badlogicgames.gdx/gdx "1.0-SNAPSHOT"]
                 [com.badlogicgames.gdx/gdx-backend-robovm "1.0-SNAPSHOT"]
                 [org.clojure/clojure "1.5.1"]
                 [play-clj "0.2.0-SNAPSHOT"]]
  :repositories [["sonatype"
                  "https://oss.sonatype.org/content/repositories/snapshots/"]]
  :source-paths ["src/clojure" "../desktop/src-common"]
  :java-source-paths ["src/java"]
  :javac-options ["-target" "1.7" "-source" "1.7" "-Xlint:-options"]
  :ios {:robovm-opts ["-forcelinkclasses" "minimal_3d.**:clojure.**:com.badlogic.**:play_clj.**"
                      "-libs" "libs/libObjectAL.a:libs/libgdx.a"
                      "-frameworks" "UIKit:OpenGLES:QuartzCore:CoreGraphics:OpenAL:AudioToolbox:AVFoundation"
                      "-resources" "../desktop/resources/**"]}
  :aot :all
  :main minimal_3d.core.IOSLauncher)
