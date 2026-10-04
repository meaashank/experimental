package com.mbridge.msdk.mbsignalcommon.mraid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes5.dex */
public class d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static double f157579f = -1.0d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f157580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AudioManager f157581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f157582c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b f157583d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a f157584e;

    public static class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<d> f157585a;

        public a(d dVar) {
            this.f157585a = new WeakReference<>(dVar);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            d dVar;
            b bVarB;
            if (!"android.media.VOLUME_CHANGED_ACTION".equals(intent.getAction()) || intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) != 3 || (dVar = this.f157585a.get()) == null || (bVarB = dVar.b()) == null) {
                return;
            }
            double dA = dVar.a();
            if (dA >= 0.0d) {
                bVarB.a(dA);
            }
        }
    }

    public interface b {
        void a(double d10);
    }

    public d(Context context) {
        this.f157580a = context;
        this.f157581b = (AudioManager) context.getApplicationContext().getSystemService("audio");
    }

    public double a() {
        AudioManager audioManager = this.f157581b;
        int streamMaxVolume = audioManager != null ? audioManager.getStreamMaxVolume(3) : -1;
        AudioManager audioManager2 = this.f157581b;
        double streamVolume = (((double) (audioManager2 != null ? audioManager2.getStreamVolume(3) : -1)) * 100.0d) / ((double) streamMaxVolume);
        f157579f = streamVolume;
        return streamVolume;
    }

    public b b() {
        return this.f157583d;
    }

    public void c() {
        if (this.f157580a != null) {
            this.f157584e = new a(this);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
            this.f157580a.registerReceiver(this.f157584e, intentFilter);
            this.f157582c = true;
        }
    }

    public void d() {
        Context context;
        if (!this.f157582c || (context = this.f157580a) == null) {
            return;
        }
        try {
            context.unregisterReceiver(this.f157584e);
            this.f157583d = null;
            this.f157582c = false;
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void a(b bVar) {
        this.f157583d = bVar;
    }
}
