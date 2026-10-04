package com.prism.hider.utils;

import android.animation.ValueAnimator;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Point;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.CountDownTimer;
import android.os.Process;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import com.mbridge.msdk.MBridgeConstans;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import q8.C5443b;
import t7.C5617a;

/* JADX INFO: loaded from: classes6.dex */
public class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f168379b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f168380c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f168381d = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f168378a = k.g(h.class.getSimpleName());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f168382e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f168383f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f168384g = "com.android.launcher3.icon_origin";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f168385h = "com.android.launcher3.icon_disguise";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String[] f168386i = {f168384g, f168385h};

    public class a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f168387a;

        public a(View view) {
            this.f168387a = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.f168387a.setScaleX(fFloatValue);
            this.f168387a.setScaleY((fFloatValue * 0.6f) + 0.4f);
        }
    }

    public class b extends CountDownTimer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Button f168388a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CharSequence f168389b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Dialog f168390c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j10, long j11, Button button, CharSequence charSequence, Dialog dialog) {
            super(j10, j11);
            this.f168388a = button;
            this.f168389b = charSequence;
            this.f168390c = dialog;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            if (this.f168390c.isShowing()) {
                this.f168388a.setText(this.f168389b);
                this.f168388a.setEnabled(true);
                this.f168388a.setClickable(true);
            }
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j10) {
            this.f168388a.setText(String.format(Locale.getDefault(), "%s (%d)", this.f168389b, Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j10) + 1)));
        }
    }

    public static /* synthetic */ void a(Dialog dialog, int i10, int i11, DialogInterface dialogInterface) {
        Button buttonB = b(dialog, i10);
        CharSequence text = buttonB.getText();
        buttonB.setClickable(false);
        buttonB.setEnabled(false);
        new b(i11, 100L, buttonB, text, dialog).start();
    }

    public static Button b(Dialog dialog, int i10) {
        if (dialog instanceof AlertDialog) {
            return ((AlertDialog) dialog).getButton(i10);
        }
        if (dialog instanceof androidx.appcompat.app.AlertDialog) {
            return ((androidx.appcompat.app.AlertDialog) dialog).f(i10);
        }
        throw new IllegalStateException("dialog:" + dialog + " is nether android.app.AlertDialog nor android.support.v7.app.AlertDialog");
    }

    public static String c(Context context) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
            packageInfo = null;
        }
        return packageInfo != null ? packageInfo.versionName : "";
    }

    public static String d(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i10 = 0; i10 < bArr.length; i10++) {
            if (Integer.toHexString(bArr[i10] & 255).length() == 1) {
                stringBuffer.append(MBridgeConstans.ENDCARD_URL_TYPE_PL);
                stringBuffer.append(Integer.toHexString(bArr[i10] & 255));
            } else {
                stringBuffer.append(Integer.toHexString(bArr[i10] & 255));
            }
        }
        return stringBuffer.toString();
    }

    public static boolean e(Context context) {
        return true;
    }

    public static String f(Context context) {
        String country = context.getResources().getConfiguration().locale.getCountry();
        k.c(f168378a, country);
        return country;
    }

    public static String g(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.reset();
            messageDigest.update(str.getBytes("UTF-8"));
            return d(messageDigest.digest());
        } catch (UnsupportedEncodingException e10) {
            e10.printStackTrace();
            return null;
        } catch (NoSuchAlgorithmException e11) {
            e11.printStackTrace();
            return null;
        }
    }

    public static int h(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (!q(applicationContext)) {
            return -1;
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) applicationContext.getSystemService(C5617a.f239212e)).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return 0;
        }
        if (activeNetworkInfo.getType() == 0) {
            return 2;
        }
        return 1 == activeNetworkInfo.getType() ? 1 : 0;
    }

    public static String i() {
        return Build.VERSION.RELEASE;
    }

    public static String j(Context context) {
        String str;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return null;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.pid == Process.myPid() && (str = runningAppProcessInfo.processName) != null) {
                return str;
            }
        }
        return null;
    }

    public static int k(Context context) {
        if (f168383f == 0) {
            Display defaultDisplay = ((WindowManager) context.getSystemService(C5443b.f226850e)).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            f168383f = point.y;
        }
        return f168383f;
    }

    public static Point l(Context context) {
        Point point = new Point(f168382e, f168383f);
        if (point.x != 0 && point.y != 0) {
            return point;
        }
        ((WindowManager) context.getSystemService(C5443b.f226850e)).getDefaultDisplay().getSize(point);
        return point;
    }

    public static int m(Context context) {
        if (f168382e == 0) {
            Display defaultDisplay = ((WindowManager) context.getSystemService(C5443b.f226850e)).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            f168382e = point.x;
        }
        return f168382e;
    }

    public static int n(Context context) {
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static boolean o(Context context, String str) {
        List<ActivityManager.RunningTaskInfo> runningTasks = ((ActivityManager) context.getSystemService("activity")).getRunningTasks(1);
        return runningTasks != null && runningTasks.size() > 0 && str.equals(runningTasks.get(0).topActivity.getClassName());
    }

    public static boolean p(Context context) {
        return context.getPackageName().equals(j(context));
    }

    public static boolean q(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getApplicationContext().getSystemService(C5617a.f239212e);
        return (connectivityManager == null || connectivityManager.getActiveNetworkInfo() == null) ? false : true;
    }

    public static void r(Context context) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.MAIN");
        intent.setClassName("com.android.settings", "com.android.settings.ManageApplications");
        context.startActivity(intent);
    }

    public static void s(final Dialog dialog, final int i10, final int i11) {
        dialog.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.prism.hider.utils.g
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                h.a(dialog, i10, i11, dialogInterface);
            }
        });
    }

    public static void t(View view, float f10, float f11) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f10, f11);
        valueAnimatorOfFloat.setDuration(200L);
        valueAnimatorOfFloat.start();
        valueAnimatorOfFloat.addUpdateListener(new a(view));
    }

    public static void u(Context context) {
        String str = com.prism.hider.variant.b.b().e(context) ? f168385h : f168384g;
        PackageManager packageManager = context.getPackageManager();
        for (String str2 : f168386i) {
            if (!str2.equals(str)) {
                packageManager.setComponentEnabledSetting(new ComponentName(context.getApplicationContext(), str2), 2, 1);
            }
        }
        packageManager.setComponentEnabledSetting(new ComponentName(context.getApplicationContext(), str), 1, 1);
    }
}
