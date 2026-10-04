package com.mbridge.msdk.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.OrientationEventListener;
import android.view.WindowInsets;
import android.view.WindowManager;
import androidx.core.view.G;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.f1;
import com.mbridge.msdk.foundation.tools.q0;
import org.objectweb.asm.Opcodes;
import q8.C5443b;

/* JADX INFO: loaded from: classes5.dex */
public abstract class MBBaseActivity extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Display f153714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private OrientationEventListener f153715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f153716c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile boolean f153717d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Runnable f153718e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.mbridge.msdk.config.activity.backdispatcher.a f153719f;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                MBBaseActivity.this.b();
            } catch (Exception e10) {
                q0.b("MBBaseActivity", e10.getMessage());
            }
        }
    }

    public class b extends OrientationEventListener {
        public b(Context context, int i10) {
            super(context, i10);
        }

        @Override // android.view.OrientationEventListener
        public void onOrientationChanged(int i10) {
            int rotation = MBBaseActivity.this.f153714a != null ? MBBaseActivity.this.f153714a.getRotation() : 0;
            if (rotation == 1 && MBBaseActivity.this.f153716c != 1) {
                MBBaseActivity.this.f153716c = 1;
                MBBaseActivity.this.getNotchParams();
                q0.b("MBBaseActivity", "Orientation Left");
                return;
            }
            if (rotation == 3 && MBBaseActivity.this.f153716c != 2) {
                MBBaseActivity.this.f153716c = 2;
                MBBaseActivity.this.getNotchParams();
                q0.b("MBBaseActivity", "Orientation Right");
            } else if (rotation == 0 && MBBaseActivity.this.f153716c != 3) {
                MBBaseActivity.this.f153716c = 3;
                MBBaseActivity.this.getNotchParams();
                q0.b("MBBaseActivity", "Orientation Top");
            } else {
                if (rotation != 2 || MBBaseActivity.this.f153716c == 4) {
                    return;
                }
                MBBaseActivity.this.f153716c = 4;
                MBBaseActivity.this.getNotchParams();
                q0.b("MBBaseActivity", "Orientation Bottom");
            }
        }
    }

    public class c implements com.mbridge.msdk.config.activity.backdispatcher.b {
        public c() {
        }

        @Override // com.mbridge.msdk.config.activity.backdispatcher.b
        public void a() {
            MBBaseActivity.this.onBackDispatched();
        }
    }

    private void d() {
        b bVar = new b(this, 1);
        this.f153715b = bVar;
        if (bVar.canDetectOrientation()) {
            this.f153715b.enable();
        } else {
            this.f153715b.disable();
            this.f153715b = null;
        }
    }

    public void getNotchParams() {
        if (this.f153717d) {
            return;
        }
        this.f153718e = new a();
        getWindow().getDecorView().postDelayed(this.f153718e, 500L);
    }

    public abstract void onBackDispatched();

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f153717d = false;
        try {
            requestWindowFeature(1);
            getWindow().setFlags(1024, 1024);
            getWindow().addFlags(512);
            c();
            a();
            f1.c(getWindow());
            if (Build.VERSION.SDK_INT >= 33) {
                registerBackInvokedDispatcher();
            }
        } catch (Exception e10) {
            q0.b("MBBaseActivity", e10.getMessage());
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        this.f153717d = true;
        super.onDestroy();
        try {
            OrientationEventListener orientationEventListener = this.f153715b;
            if (orientationEventListener != null) {
                orientationEventListener.disable();
                this.f153715b = null;
            }
            if (this.f153718e != null) {
                getWindow().getDecorView().removeCallbacks(this.f153718e);
            }
            if (Build.VERSION.SDK_INT >= 33) {
                unRegisterBackInvokedDispatcher();
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("MBBaseActivity", e10.getMessage());
            }
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        if (com.mbridge.msdk.foundation.feedback.b.f156248f) {
            return;
        }
        getNotchParams();
        c();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        c();
    }

    public void registerBackInvokedDispatcher() {
        try {
            com.mbridge.msdk.config.activity.backdispatcher.a aVar = new com.mbridge.msdk.config.activity.backdispatcher.a();
            this.f153719f = aVar;
            aVar.a(getWindow(), new c());
        } catch (Throwable th) {
            q0.b("MBBaseActivity", th.getMessage());
        }
    }

    public abstract void setTopControllerPadding(int i10, int i11, int i12, int i13, int i14);

    public void unRegisterBackInvokedDispatcher() {
        try {
            com.mbridge.msdk.config.activity.backdispatcher.a aVar = this.f153719f;
            if (aVar == null) {
                return;
            }
            aVar.a(getWindow());
        } catch (Throwable th) {
            q0.b("MBBaseActivity", th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        MBBaseActivity mBBaseActivity;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        DisplayCutout displayCutout;
        int i15 = Build.VERSION.SDK_INT;
        if (this.f153717d) {
            return;
        }
        WindowInsets rootWindowInsets = getWindow().getDecorView().getRootWindowInsets();
        int i16 = -1;
        if (rootWindowInsets == null || i15 < 28 || (displayCutout = rootWindowInsets.getDisplayCutout()) == null) {
            mBBaseActivity = this;
            i10 = -1;
            i11 = 0;
            i12 = 0;
            i13 = 0;
            i14 = 0;
        } else {
            int safeInsetLeft = displayCutout.getSafeInsetLeft();
            int safeInsetRight = displayCutout.getSafeInsetRight();
            int safeInsetTop = displayCutout.getSafeInsetTop();
            int safeInsetBottom = displayCutout.getSafeInsetBottom();
            Display display = this.f153714a;
            int rotation = display != null ? display.getRotation() : a();
            if (this.f153716c == -1) {
                this.f153716c = rotation == 0 ? 3 : rotation == 1 ? 1 : rotation == 2 ? 4 : rotation == 3 ? 2 : -1;
                q0.b("MBBaseActivity", this.f153716c + "");
            }
            if (rotation != 0) {
                if (rotation == 1) {
                    i16 = 90;
                } else if (rotation == 2) {
                    i16 = Opcodes.GETFIELD;
                } else if (rotation == 3) {
                    i16 = 270;
                }
                mBBaseActivity = this;
                i14 = safeInsetBottom;
                i11 = safeInsetLeft;
                i10 = i16;
            } else {
                mBBaseActivity = this;
                i14 = safeInsetBottom;
                i11 = safeInsetLeft;
                i10 = 0;
            }
            i12 = safeInsetRight;
            i13 = safeInsetTop;
        }
        mBBaseActivity.setTopControllerPadding(i10, i11, i12, i13, i14);
        if (mBBaseActivity.f153715b == null) {
            d();
        }
    }

    private void c() {
        try {
            getWindow().addFlags(67108864);
            getWindow().getDecorView().setSystemUiVisibility(G.f111534l);
        } catch (Throwable th) {
            q0.b("MBBaseActivity", th.getMessage());
        }
    }

    private int a() {
        if (this.f153714a == null) {
            if (Build.VERSION.SDK_INT >= 30) {
                this.f153714a = getDisplay();
            } else {
                this.f153714a = ((WindowManager) getSystemService(C5443b.f226850e)).getDefaultDisplay();
            }
        }
        Display display = this.f153714a;
        if (display != null) {
            return display.getRotation();
        }
        return -1;
    }
}
