package com.prism.gaia.naked.metadata.android.provider;

import W6.b;
import W6.c;
import W6.i;
import W6.j;
import W6.l;
import W6.n;
import W6.q;
import android.os.IInterface;
import android.provider.Settings;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedObject;
import com.prism.gaia.naked.entity.NakedStaticObject;

/* JADX INFO: loaded from: classes6.dex */
@b
@c
public final class SettingsCAGI {

    @l
    @i(Settings.class)
    public interface G extends ClassAccessor {

        @l
        @i(Settings.Secure.class)
        public interface Secure extends ClassAccessor {
            @q("sNameValueCache")
            NakedStaticObject<Object> sNameValueCache();
        }

        @l
        @i(Settings.System.class)
        public interface System extends ClassAccessor {
            @q("sNameValueCache")
            NakedStaticObject<Object> sNameValueCache();
        }
    }

    @l
    @i(Settings.class)
    public interface J17 extends ClassAccessor {

        @l
        @i(Settings.Global.class)
        public interface Global extends ClassAccessor {
            @q("sNameValueCache")
            NakedStaticObject<Object> sNameValueCache();
        }
    }

    @l
    @i(Settings.class)
    public interface O26 extends ClassAccessor {

        @l
        @j("android.provider.Settings$ContentProviderHolder")
        public interface ContentProviderHolder extends ClassAccessor {
            @n("mContentProvider")
            NakedObject<IInterface> mContentProvider();
        }

        @l
        @j("android.provider.Settings$NameValueCache")
        public interface NameValueCache extends ClassAccessor {
            @n("mProviderHolder")
            NakedObject<Object> mProviderHolder();
        }
    }

    @l
    @i(Settings.class)
    public interface Q29 extends ClassAccessor {

        @l
        @j("android.provider.Settings$Config")
        public interface Config extends ClassAccessor {
            @q("sNameValueCache")
            NakedStaticObject<Object> sNameValueCache();
        }
    }

    @l
    @i(Settings.class)
    public interface _O26 extends ClassAccessor {

        @l
        @j("android.provider.Settings$NameValueCache")
        public interface NameValueCache extends ClassAccessor {
            @n("mContentProvider")
            NakedObject<Object> mContentProvider();
        }
    }
}
