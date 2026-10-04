package com.prism.gaia.naked.metadata.android.os;

import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedObject;
import com.prism.gaia.naked.entity.NakedStaticObject;
import java.io.File;

/* JADX INFO: loaded from: classes6.dex */
@W6.b
@W6.c
public final class EnvironmentCAGI {

    @W6.m
    @W6.j("android.os.Environment")
    public interface C extends ClassAccessor {
        @W6.q("DIRECTORY_ANDROID")
        NakedStaticObject<String> DIRECTORY_ANDROID();

        @W6.q("DIR_ANDROID")
        NakedStaticObject<String> DIR_ANDROID();
    }

    @W6.l
    @W6.j("android.os.Environment")
    public interface G extends ClassAccessor {

        public interface UserEnvironmentN {

            @W6.l
            @W6.j("android.os.Environment$UserEnvironment")
            public interface L extends ClassAccessor {
                @W6.n("mExternalDirsForApp")
                NakedObject<File[]> mExternalDirsForApp();
            }
        }

        @W6.q("DIRECTORY_ALARMS")
        NakedStaticObject<String> DIRECTORY_ALARMS();

        @W6.q("DIRECTORY_DCIM")
        NakedStaticObject<String> DIRECTORY_DCIM();

        @W6.q("DIRECTORY_DOWNLOADS")
        NakedStaticObject<String> DIRECTORY_DOWNLOADS();

        @W6.q("DIRECTORY_MOVIES")
        NakedStaticObject<String> DIRECTORY_MOVIES();

        @W6.q("DIRECTORY_MUSIC")
        NakedStaticObject<String> DIRECTORY_MUSIC();

        @W6.q("DIRECTORY_NOTIFICATIONS")
        NakedStaticObject<String> DIRECTORY_NOTIFICATIONS();

        @W6.q("DIRECTORY_PICTURES")
        NakedStaticObject<String> DIRECTORY_PICTURES();

        @W6.q("DIRECTORY_PODCASTS")
        NakedStaticObject<String> DIRECTORY_PODCASTS();

        @W6.q("DIRECTORY_RINGTONES")
        NakedStaticObject<String> DIRECTORY_RINGTONES();

        @W6.q("sCurrentUser")
        NakedStaticObject<Object> sCurrentUser();
    }

    @W6.l
    @W6.j("android.os.Environment")
    public interface K19 extends ClassAccessor {
        @W6.q("DIRECTORY_DOCUMENTS")
        NakedStaticObject<String> DIRECTORY_DOCUMENTS();
    }

    @W6.l
    @W6.j("android.os.Environment")
    public interface Q29 extends ClassAccessor {
        @W6.q("DIRECTORY_AUDIOBOOKS")
        NakedStaticObject<String> DIRECTORY_AUDIOBOOKS();

        @W6.q("DIRECTORY_SCREENSHOTS")
        NakedStaticObject<String> DIRECTORY_SCREENSHOTS();
    }

    @W6.l
    @W6.j("android.os.Environment")
    public interface S31 extends ClassAccessor {
        @W6.q("DIRECTORY_RECORDINGS")
        NakedStaticObject<String> DIRECTORY_RECORDINGS();

        @W6.q("DIR_DATA")
        NakedStaticObject<String> DIR_DATA();
    }
}
