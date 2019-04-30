(ns clarice.runner
    (:require [doo.runner :refer-macros [doo-tests]]
              [clarice.core-test]))

(doo-tests 'clarice.core-test)
