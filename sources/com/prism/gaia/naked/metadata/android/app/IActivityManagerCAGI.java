package com.prism.gaia.naked.metadata.android.app;

import android.content.Intent;
import android.content.pm.ProviderInfo;
import android.os.IBinder;
import android.os.IInterface;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedBoolean;
import com.prism.gaia.naked.entity.NakedConstructor;
import com.prism.gaia.naked.entity.NakedMethod;
import com.prism.gaia.naked.entity.NakedObject;

/* JADX INFO: loaded from: classes6.dex */
@W6.b
@W6.c
public final class IActivityManagerCAGI {

    @W6.m
    @W6.j("android.app.IActivityManager")
    public interface C extends ClassAccessor {
        @W6.p("startActivity")
        NakedMethod<Integer> startActivity();

        @W6.n("startActivityWithFeature")
        NakedMethod<Integer> startActivityWithFeature();
    }

    @W6.l
    @W6.j("android.app.IActivityManager")
    public interface G extends ClassAccessor {
        @W6.p("getTaskForActivity")
        @W6.f({IBinder.class, boolean.class})
        NakedMethod<Integer> getTaskForActivity();

        @W6.p("overridePendingTransition")
        @W6.f({IBinder.class, String.class, int.class, int.class})
        NakedMethod<Void> overridePendingTransition();

        @W6.p("setRequestedOrientation")
        @W6.f({IBinder.class, int.class})
        NakedMethod<Void> setRequestedOrientation();

        @W6.p("startActivities")
        NakedMethod<Integer> startActivities();
    }

    @W6.l
    @W6.j("android.app.IActivityManager")
    public interface L21_M23 extends ClassAccessor {
        @W6.p("finishActivity")
        @W6.f({IBinder.class, int.class, Intent.class, boolean.class})
        NakedMethod<Boolean> finishActivity();
    }

    @W6.l
    @W6.j("android.app.IActivityManager")
    public interface N21_ extends ClassAccessor {
        @W6.p("addPackageDependency")
        @W6.f({String.class})
        NakedMethod<Void> addPackageDependency();
    }

    @W6.l
    @W6.j("android.app.IActivityManager")
    public interface N24 extends ClassAccessor {
        @W6.p("finishActivity")
        @W6.f({IBinder.class, int.class, Intent.class, int.class})
        NakedMethod<Boolean> finishActivity();
    }

    @W6.l
    @W6.j("android.app.IActivityManager")
    public interface _K20 extends ClassAccessor {
        @W6.p("finishActivity")
        @W6.f({IBinder.class, int.class, Intent.class})
        NakedMethod<Boolean> finishActivity();
    }

    public interface _N25 {

        @W6.l
        @W6.j("android.app.IActivityManager$ContentProviderHolder")
        public interface ContentProviderHolder extends ClassAccessor {
            @W6.n("connection")
            NakedObject<IBinder> connection();

            @W6.f({ProviderInfo.class})
            @W6.k
            NakedConstructor<Object> ctor();

            @W6.n("info")
            NakedObject<ProviderInfo> info();

            @W6.n("noReleaseNeeded")
            NakedBoolean noReleaseNeeded();

            @W6.n("provider")
            NakedObject<IInterface> provider();
        }
    }
}
