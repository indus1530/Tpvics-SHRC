package edu.aku.hassannaqvi.tpvics_hh_shrc.utils.shared

object Keys {

    init {
        System.loadLibrary("native-lib")
    }

    external fun apiKey(): String
}