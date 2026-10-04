package com.prism.gaia.naked.metadata.android.content;

import W6.b;
import W6.c;
import W6.f;
import W6.i;
import W6.k;
import W6.m;
import W6.n;
import W6.p;
import android.content.BroadcastReceiver;
import android.os.Bundle;
import android.os.IBinder;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedBoolean;
import com.prism.gaia.naked.entity.NakedConstructor;
import com.prism.gaia.naked.entity.NakedInt;
import com.prism.gaia.naked.entity.NakedMethod;
import com.prism.gaia.naked.entity.NakedObject;

/* JADX INFO: loaded from: classes6.dex */
@b
@c
public final class BroadcastReceiverCAGI {

    @m
    @i(BroadcastReceiver.class)
    public interface C extends ClassAccessor {

        @i(BroadcastReceiver.PendingResult.class)
        @m
        public interface PendingResult extends ClassAccessor {
            @f({int.class, String.class, Bundle.class, int.class, boolean.class, boolean.class, IBinder.class})
            @k
            NakedConstructor<BroadcastReceiver.PendingResult> ctor();

            @n("mAbortBroadcast")
            NakedBoolean mAbortBroadcast();

            @n("mFinished")
            NakedBoolean mFinished();

            @n("mInitialStickyHint")
            NakedBoolean mInitialStickyHint();

            @n("mOrderedHint")
            NakedBoolean mOrderedHint();

            @n("mResultCode")
            NakedInt mResultCode();

            @n("mResultData")
            NakedObject<String> mResultData();

            @n("mResultExtras")
            NakedObject<Bundle> mResultExtras();

            @n("mToken")
            NakedObject<IBinder> mToken();

            @n("mType")
            NakedInt mType();

            @p("sendFinished")
            NakedMethod<Void> sendFinished();
        }

        @p("getPendingResult")
        NakedMethod<BroadcastReceiver.PendingResult> getPendingResult();

        @p("setPendingResult")
        @f({BroadcastReceiver.PendingResult.class})
        NakedMethod<Void> setPendingResult();
    }

    @m
    @i(BroadcastReceiver.class)
    public interface CJ17 extends ClassAccessor {

        @i(BroadcastReceiver.PendingResult.class)
        @m
        public interface PendingResult extends ClassAccessor {
            @f({int.class, String.class, Bundle.class, int.class, boolean.class, boolean.class, IBinder.class, int.class})
            @k
            NakedConstructor<BroadcastReceiver.PendingResult> ctor();

            @n("mAbortBroadcast")
            NakedBoolean mAbortBroadcast();

            @n("mFinished")
            NakedBoolean mFinished();

            @n("mInitialStickyHint")
            NakedBoolean mInitialStickyHint();

            @n("mOrderedHint")
            NakedBoolean mOrderedHint();

            @n("mResultCode")
            NakedInt mResultCode();

            @n("mResultData")
            NakedObject<String> mResultData();

            @n("mResultExtras")
            NakedObject<Bundle> mResultExtras();

            @n("mSendingUser")
            NakedInt mSendingUser();

            @n("mToken")
            NakedObject<IBinder> mToken();

            @n("mType")
            NakedInt mType();
        }

        @p("getPendingResult")
        NakedMethod<BroadcastReceiver.PendingResult> getPendingResult();

        @p("setPendingResult")
        @f({BroadcastReceiver.PendingResult.class})
        NakedMethod<Void> setPendingResult();
    }

    @m
    @i(BroadcastReceiver.class)
    public interface CM23 extends ClassAccessor {

        @i(BroadcastReceiver.PendingResult.class)
        @m
        public interface PendingResult extends ClassAccessor {
            @f({int.class, String.class, Bundle.class, int.class, boolean.class, boolean.class, IBinder.class, int.class, int.class})
            @k
            NakedConstructor<BroadcastReceiver.PendingResult> ctor();

            @n("mAbortBroadcast")
            NakedBoolean mAbortBroadcast();

            @n("mFinished")
            NakedBoolean mFinished();

            @n("mFlags")
            NakedInt mFlags();

            @n("mInitialStickyHint")
            NakedBoolean mInitialStickyHint();

            @n("mOrderedHint")
            NakedBoolean mOrderedHint();

            @n("mResultCode")
            NakedInt mResultCode();

            @n("mResultData")
            NakedObject<String> mResultData();

            @n("mResultExtras")
            NakedObject<Bundle> mResultExtras();

            @n("mSendingUser")
            NakedInt mSendingUser();

            @n("mToken")
            NakedObject<IBinder> mToken();

            @n("mType")
            NakedInt mType();
        }

        @p("getPendingResult")
        NakedMethod<BroadcastReceiver.PendingResult> getPendingResult();

        @p("setPendingResult")
        @f({BroadcastReceiver.PendingResult.class})
        NakedMethod<Void> setPendingResult();
    }
}
