package androidx.core.app;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class NotificationChannelGroupCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f110753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CharSequence f110754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f110755c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f110756d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List<NotificationChannelCompat> f110757e;

    public static class Builder {
        final NotificationChannelGroupCompat mGroup;

        public Builder(@NonNull String str) {
            this.mGroup = new NotificationChannelGroupCompat(str);
        }

        @NonNull
        public NotificationChannelGroupCompat build() {
            return this.mGroup;
        }

        @NonNull
        public Builder setDescription(@Nullable String str) {
            this.mGroup.f110755c = str;
            return this;
        }

        @NonNull
        public Builder setName(@Nullable CharSequence charSequence) {
            this.mGroup.f110754b = charSequence;
            return this;
        }
    }

    @e.T(26)
    public static class a {
        public static NotificationChannelGroup a(String str, CharSequence charSequence) {
            return new NotificationChannelGroup(str, charSequence);
        }

        public static List<NotificationChannel> b(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getChannels();
        }

        public static String c(NotificationChannel notificationChannel) {
            return notificationChannel.getGroup();
        }

        public static String d(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getId();
        }

        public static CharSequence e(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getName();
        }
    }

    @e.T(28)
    public static class b {
        public static String a(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getDescription();
        }

        public static boolean b(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.isBlocked();
        }

        public static void c(NotificationChannelGroup notificationChannelGroup, String str) {
            notificationChannelGroup.setDescription(str);
        }
    }

    public NotificationChannelGroupCompat(@NonNull String str) {
        this.f110757e = Collections.EMPTY_LIST;
        str.getClass();
        this.f110753a = str;
    }

    @NonNull
    public List<NotificationChannelCompat> a() {
        return this.f110757e;
    }

    @e.T(26)
    public final List<NotificationChannelCompat> b(List<NotificationChannel> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<NotificationChannel> it = list.iterator();
        while (it.hasNext()) {
            NotificationChannel notificationChannelA = B.a(it.next());
            if (this.f110753a.equals(a.c(notificationChannelA))) {
                arrayList.add(new NotificationChannelCompat(notificationChannelA));
            }
        }
        return arrayList;
    }

    @Nullable
    public String c() {
        return this.f110755c;
    }

    @NonNull
    public String d() {
        return this.f110753a;
    }

    @Nullable
    public CharSequence e() {
        return this.f110754b;
    }

    public NotificationChannelGroup f() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 26) {
            return null;
        }
        NotificationChannelGroup notificationChannelGroupA = a.a(this.f110753a, this.f110754b);
        if (i10 >= 28) {
            b.c(notificationChannelGroupA, this.f110755c);
        }
        return notificationChannelGroupA;
    }

    public boolean g() {
        return this.f110756d;
    }

    @NonNull
    public Builder h() {
        return new Builder(this.f110753a).setName(this.f110754b).setDescription(this.f110755c);
    }

    @e.T(28)
    public NotificationChannelGroupCompat(@NonNull NotificationChannelGroup notificationChannelGroup) {
        this(notificationChannelGroup, Collections.EMPTY_LIST);
    }

    @e.T(26)
    public NotificationChannelGroupCompat(@NonNull NotificationChannelGroup notificationChannelGroup, @NonNull List<NotificationChannel> list) {
        this(a.d(notificationChannelGroup));
        this.f110754b = a.e(notificationChannelGroup);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            this.f110755c = b.a(notificationChannelGroup);
        }
        if (i10 >= 28) {
            this.f110756d = b.b(notificationChannelGroup);
            this.f110757e = b(a.b(notificationChannelGroup));
        } else {
            this.f110757e = b(list);
        }
    }
}
