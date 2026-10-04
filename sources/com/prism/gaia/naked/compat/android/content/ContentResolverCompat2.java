package com.prism.gaia.naked.compat.android.content;

import W6.c;
import android.content.Intent;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class ContentResolverCompat2 {

    public static class Util {
        private static final Intent ACTION_SYNC_CONN_STATUS_CHANGED = new Intent("com.android.sync.SYNC_CONN_STATUS_CHANGED");
        public static final int NOTIFY_SYNC_TO_NETWORK = 1;
        public static final String SYNC_EXTRAS_DISALLOW_METERED = "allow_metered";
        public static final String SYNC_EXTRAS_EXPECTED_DOWNLOAD = "expected_download";
        public static final String SYNC_EXTRAS_EXPECTED_UPLOAD = "expected_upload";
        private static final int SYNC_OBSERVER_TYPE_STATUS = 8;

        public static Intent getIntentOfSyncConnStatusChange() {
            return ACTION_SYNC_CONN_STATUS_CHANGED;
        }

        public static int getStatusOfSyncObserverType() {
            return 8;
        }

        public static String getSyncExtrasDisallowMetered() {
            return "allow_metered";
        }

        public static String getSyncExtrasExpectedDownload() {
            return SYNC_EXTRAS_EXPECTED_DOWNLOAD;
        }

        public static String getSyncExtrasExpectedUpload() {
            return SYNC_EXTRAS_EXPECTED_UPLOAD;
        }
    }
}
