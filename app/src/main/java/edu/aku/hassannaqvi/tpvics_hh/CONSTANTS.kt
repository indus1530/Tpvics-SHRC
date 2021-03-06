package edu.aku.hassannaqvi.tpvics_hh

class CONSTANTS {
    companion object {
        //For Login
        const val MY_PERMISSIONS_REQUEST_READ_CONTACTS = 0
        const val MY_PERMISSIONS_REQUEST_READ_PHONE_STATE = 2
        const val TWO_MINUTES = 1000 * 60 * 2
        const val MINIMUM_DISTANCE_CHANGE_FOR_UPDATES: Long = 1 // in Meters
        const val MINIMUM_TIME_BETWEEN_UPDATES: Long = 1000 // in Milliseconds
        const val MEMBER_ITEM = 101
        const val SERIAL_EXTRA = "key"
        const val MINYEAR = 1940

        //For CHC Section
        const val IM01FLAG = "im02_flag"
        const val IM02CARDSEEN = "im01_card_seen"

        //Login Result Code
        const val LOGIN_RESULT_CODE = 10101
        const val LOGIN_SPLASH_FLAG = "splash_flag"

        //SubInfo
        const val SUB_INFO_END_FLAG = "sub_info_end_flag"
        const val FSTATUS_END_FLAG = "fstatus_end_flag"

        //Child Activity
        const val CHILD_ENDING_AGE_ISSUE = "childAgeIssue"
        const val CHILD_NO_ANSWER = "childNoAns"
        const val CHILD_PARENT_NA = "childPrNA"
        const val CHILD_SERIAL = "serial_extra"

        //MainActivity
        const val LAST_DATA_DOWNLOAD = "lastDataDownload"
        const val LAST_PHOTO_UPLOAD = "lastPhotoUpload"
        const val LAST_DATA_UPLOAD = "lastDataUpload"
        const val DOWNLOAD_FILE_REFID = "downloadFileRefID"
        const val TAG_NAME = "tagName"
        const val BACKUP_DT = "backupDT"

        //Sync activity
        const val SYNC_UCID_LOGIN = "district_id_login"
        const val SYNC_LOGIN = "sync_login"

    }
}