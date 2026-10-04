package androidx.core.app;

import android.app.Notification;
import android.app.NotificationChannel;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public class NotificationChannelCompat {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f110732s = "miscellaneous";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final boolean f110733t = true;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f110734u = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final String f110735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CharSequence f110736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f110737c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f110738d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f110739e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f110740f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Uri f110741g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public AudioAttributes f110742h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f110743i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f110744j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f110745k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long[] f110746l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f110747m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f110748n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f110749o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f110750p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f110751q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f110752r;

    public static class Builder {
        private final NotificationChannelCompat mChannel;

        public Builder(@NonNull String str, int i10) {
            this.mChannel = new NotificationChannelCompat(str, i10);
        }

        @NonNull
        public NotificationChannelCompat build() {
            return this.mChannel;
        }

        @NonNull
        public Builder setConversationId(@NonNull String str, @NonNull String str2) {
            if (Build.VERSION.SDK_INT >= 30) {
                NotificationChannelCompat notificationChannelCompat = this.mChannel;
                notificationChannelCompat.f110747m = str;
                notificationChannelCompat.f110748n = str2;
            }
            return this;
        }

        @NonNull
        public Builder setDescription(@Nullable String str) {
            this.mChannel.f110738d = str;
            return this;
        }

        @NonNull
        public Builder setGroup(@Nullable String str) {
            this.mChannel.f110739e = str;
            return this;
        }

        @NonNull
        public Builder setImportance(int i10) {
            this.mChannel.f110737c = i10;
            return this;
        }

        @NonNull
        public Builder setLightColor(int i10) {
            this.mChannel.f110744j = i10;
            return this;
        }

        @NonNull
        public Builder setLightsEnabled(boolean z10) {
            this.mChannel.f110743i = z10;
            return this;
        }

        @NonNull
        public Builder setName(@Nullable CharSequence charSequence) {
            this.mChannel.f110736b = charSequence;
            return this;
        }

        @NonNull
        public Builder setShowBadge(boolean z10) {
            this.mChannel.f110740f = z10;
            return this;
        }

        @NonNull
        public Builder setSound(@Nullable Uri uri, @Nullable AudioAttributes audioAttributes) {
            NotificationChannelCompat notificationChannelCompat = this.mChannel;
            notificationChannelCompat.f110741g = uri;
            notificationChannelCompat.f110742h = audioAttributes;
            return this;
        }

        @NonNull
        public Builder setVibrationEnabled(boolean z10) {
            this.mChannel.f110745k = z10;
            return this;
        }

        @NonNull
        public Builder setVibrationPattern(@Nullable long[] jArr) {
            NotificationChannelCompat notificationChannelCompat = this.mChannel;
            notificationChannelCompat.f110745k = jArr != null && jArr.length > 0;
            notificationChannelCompat.f110746l = jArr;
            return this;
        }
    }

    @e.T(26)
    public static class a {
        public static boolean a(NotificationChannel notificationChannel) {
            return notificationChannel.canBypassDnd();
        }

        public static boolean b(NotificationChannel notificationChannel) {
            return notificationChannel.canShowBadge();
        }

        public static NotificationChannel c(String str, CharSequence charSequence, int i10) {
            return new NotificationChannel(str, charSequence, i10);
        }

        public static void d(NotificationChannel notificationChannel, boolean z10) {
            notificationChannel.enableLights(z10);
        }

        public static void e(NotificationChannel notificationChannel, boolean z10) {
            notificationChannel.enableVibration(z10);
        }

        public static AudioAttributes f(NotificationChannel notificationChannel) {
            return notificationChannel.getAudioAttributes();
        }

        public static String g(NotificationChannel notificationChannel) {
            return notificationChannel.getDescription();
        }

        public static String h(NotificationChannel notificationChannel) {
            return notificationChannel.getGroup();
        }

        public static String i(NotificationChannel notificationChannel) {
            return notificationChannel.getId();
        }

        public static int j(NotificationChannel notificationChannel) {
            return notificationChannel.getImportance();
        }

        public static int k(NotificationChannel notificationChannel) {
            return notificationChannel.getLightColor();
        }

        public static int l(NotificationChannel notificationChannel) {
            return notificationChannel.getLockscreenVisibility();
        }

        public static CharSequence m(NotificationChannel notificationChannel) {
            return notificationChannel.getName();
        }

        public static Uri n(NotificationChannel notificationChannel) {
            return notificationChannel.getSound();
        }

        public static long[] o(NotificationChannel notificationChannel) {
            return notificationChannel.getVibrationPattern();
        }

        public static void p(NotificationChannel notificationChannel, String str) {
            notificationChannel.setDescription(str);
        }

        public static void q(NotificationChannel notificationChannel, String str) {
            notificationChannel.setGroup(str);
        }

        public static void r(NotificationChannel notificationChannel, int i10) {
            notificationChannel.setLightColor(i10);
        }

        public static void s(NotificationChannel notificationChannel, boolean z10) {
            notificationChannel.setShowBadge(z10);
        }

        public static void t(NotificationChannel notificationChannel, Uri uri, AudioAttributes audioAttributes) {
            notificationChannel.setSound(uri, audioAttributes);
        }

        public static void u(NotificationChannel notificationChannel, long[] jArr) {
            notificationChannel.setVibrationPattern(jArr);
        }

        public static boolean v(NotificationChannel notificationChannel) {
            return notificationChannel.shouldShowLights();
        }

        public static boolean w(NotificationChannel notificationChannel) {
            return notificationChannel.shouldVibrate();
        }
    }

    @e.T(29)
    public static class b {
        public static boolean a(NotificationChannel notificationChannel) {
            return notificationChannel.canBubble();
        }
    }

    @e.T(30)
    public static class c {
        public static String a(NotificationChannel notificationChannel) {
            return notificationChannel.getConversationId();
        }

        public static String b(NotificationChannel notificationChannel) {
            return notificationChannel.getParentChannelId();
        }

        public static boolean c(NotificationChannel notificationChannel) {
            return notificationChannel.isImportantConversation();
        }

        public static void d(NotificationChannel notificationChannel, String str, String str2) {
            notificationChannel.setConversationId(str, str2);
        }
    }

    public NotificationChannelCompat(@NonNull String str, int i10) {
        this.f110740f = true;
        this.f110741g = Settings.System.DEFAULT_NOTIFICATION_URI;
        this.f110744j = 0;
        str.getClass();
        this.f110735a = str;
        this.f110737c = i10;
        this.f110742h = Notification.AUDIO_ATTRIBUTES_DEFAULT;
    }

    public boolean a() {
        return this.f110751q;
    }

    public boolean b() {
        return this.f110749o;
    }

    public boolean c() {
        return this.f110740f;
    }

    @Nullable
    public AudioAttributes d() {
        return this.f110742h;
    }

    @Nullable
    public String e() {
        return this.f110748n;
    }

    @Nullable
    public String f() {
        return this.f110738d;
    }

    @Nullable
    public String g() {
        return this.f110739e;
    }

    @NonNull
    public String h() {
        return this.f110735a;
    }

    public int i() {
        return this.f110737c;
    }

    public int j() {
        return this.f110744j;
    }

    public int k() {
        return this.f110750p;
    }

    @Nullable
    public CharSequence l() {
        return this.f110736b;
    }

    public NotificationChannel m() {
        String str;
        String str2;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 26) {
            return null;
        }
        NotificationChannel notificationChannelC = a.c(this.f110735a, this.f110736b, this.f110737c);
        a.p(notificationChannelC, this.f110738d);
        a.q(notificationChannelC, this.f110739e);
        a.s(notificationChannelC, this.f110740f);
        a.t(notificationChannelC, this.f110741g, this.f110742h);
        a.d(notificationChannelC, this.f110743i);
        a.r(notificationChannelC, this.f110744j);
        a.u(notificationChannelC, this.f110746l);
        a.e(notificationChannelC, this.f110745k);
        if (i10 >= 30 && (str = this.f110747m) != null && (str2 = this.f110748n) != null) {
            c.d(notificationChannelC, str, str2);
        }
        return notificationChannelC;
    }

    @Nullable
    public String n() {
        return this.f110747m;
    }

    @Nullable
    public Uri o() {
        return this.f110741g;
    }

    @Nullable
    public long[] p() {
        return this.f110746l;
    }

    public boolean q() {
        return this.f110752r;
    }

    public boolean r() {
        return this.f110743i;
    }

    public boolean s() {
        return this.f110745k;
    }

    @NonNull
    public Builder t() {
        return new Builder(this.f110735a, this.f110737c).setName(this.f110736b).setDescription(this.f110738d).setGroup(this.f110739e).setShowBadge(this.f110740f).setSound(this.f110741g, this.f110742h).setLightsEnabled(this.f110743i).setLightColor(this.f110744j).setVibrationEnabled(this.f110745k).setVibrationPattern(this.f110746l).setConversationId(this.f110747m, this.f110748n);
    }

    @e.T(26)
    public NotificationChannelCompat(@NonNull NotificationChannel notificationChannel) {
        this(a.i(notificationChannel), a.j(notificationChannel));
        this.f110736b = a.m(notificationChannel);
        this.f110738d = a.g(notificationChannel);
        this.f110739e = a.h(notificationChannel);
        this.f110740f = a.b(notificationChannel);
        this.f110741g = a.n(notificationChannel);
        this.f110742h = a.f(notificationChannel);
        this.f110743i = a.v(notificationChannel);
        this.f110744j = a.k(notificationChannel);
        this.f110745k = a.w(notificationChannel);
        this.f110746l = a.o(notificationChannel);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            this.f110747m = c.b(notificationChannel);
            this.f110748n = c.a(notificationChannel);
        }
        this.f110749o = a.a(notificationChannel);
        this.f110750p = a.l(notificationChannel);
        if (i10 >= 29) {
            this.f110751q = b.a(notificationChannel);
        }
        if (i10 >= 30) {
            this.f110752r = c.c(notificationChannel);
        }
    }
}
