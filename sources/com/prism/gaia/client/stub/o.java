package com.prism.gaia.client.stub;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IInterface;
import androidx.annotation.Nullable;
import com.prism.gaia.client.GaiaContext;
import com.prism.gaia.client.stub.r;
import com.prism.gaia.naked.compat.android.content.BroadcastReceiverCompat2;
import com.prism.gaia.naked.compat.android.content.IIntentReceiverCompat2;

/* JADX INFO: loaded from: classes6.dex */
public class o extends r.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f164482e = "asdf-".concat(o.class.getSimpleName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BroadcastReceiver f164483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BroadcastReceiver f164484c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final IInterface f164485d;

    public class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f164486a;

        public a(Context context) {
            this.f164486a = context;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String unused = o.f164482e;
            BroadcastReceiverCompat2.Util.setPendingResult(o.this.f164483b, goAsync());
            o.this.f164483b.onReceive(this.f164486a, intent);
        }
    }

    public o(Context context, BroadcastReceiver broadcastReceiver, @Nullable Handler handler) {
        this.f164483b = broadcastReceiver;
        a aVar = new a(context);
        this.f164484c = aVar;
        this.f164485d = GaiaContext.j().L(aVar, handler, false);
    }

    @Override // com.prism.gaia.client.stub.r
    public void L4(Intent intent, int i10, String str, Bundle bundle, boolean z10, boolean z11, int i11) {
        IIntentReceiverCompat2.Util.performReceive(this.f164485d, intent, i10, str, bundle, z10, z11, i11);
    }

    public IInterface T5() {
        return this.f164485d;
    }
}
