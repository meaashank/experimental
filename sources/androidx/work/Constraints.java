package androidx.work;

import android.net.Uri;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.room.InterfaceC2662g;
import e.T;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class Constraints {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Constraints f120208i = new Builder().build();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @InterfaceC2662g(name = "required_network_type")
    public NetworkType f120209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @InterfaceC2662g(name = "requires_charging")
    public boolean f120210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @InterfaceC2662g(name = "requires_device_idle")
    public boolean f120211c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @InterfaceC2662g(name = "requires_battery_not_low")
    public boolean f120212d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @InterfaceC2662g(name = "requires_storage_not_low")
    public boolean f120213e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @InterfaceC2662g(name = "trigger_content_update_delay")
    public long f120214f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @InterfaceC2662g(name = "trigger_max_content_delay")
    public long f120215g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @InterfaceC2662g(name = "content_uri_triggers")
    public b f120216h;

    public static final class Builder {
        b mContentUriTriggers;
        NetworkType mRequiredNetworkType;
        boolean mRequiresBatteryNotLow;
        boolean mRequiresCharging;
        boolean mRequiresDeviceIdle;
        boolean mRequiresStorageNotLow;
        long mTriggerContentMaxDelay;
        long mTriggerContentUpdateDelay;

        public Builder() {
            this.mRequiresCharging = false;
            this.mRequiresDeviceIdle = false;
            this.mRequiredNetworkType = NetworkType.NOT_REQUIRED;
            this.mRequiresBatteryNotLow = false;
            this.mRequiresStorageNotLow = false;
            this.mTriggerContentUpdateDelay = -1L;
            this.mTriggerContentMaxDelay = -1L;
            this.mContentUriTriggers = new b();
        }

        @NonNull
        @T(24)
        public Builder addContentUriTrigger(@NonNull Uri uri, boolean triggerForDescendants) {
            this.mContentUriTriggers.a(uri, triggerForDescendants);
            return this;
        }

        @NonNull
        public Constraints build() {
            return new Constraints(this);
        }

        @NonNull
        public Builder setRequiredNetworkType(@NonNull NetworkType networkType) {
            this.mRequiredNetworkType = networkType;
            return this;
        }

        @NonNull
        public Builder setRequiresBatteryNotLow(boolean requiresBatteryNotLow) {
            this.mRequiresBatteryNotLow = requiresBatteryNotLow;
            return this;
        }

        @NonNull
        public Builder setRequiresCharging(boolean requiresCharging) {
            this.mRequiresCharging = requiresCharging;
            return this;
        }

        @NonNull
        @T(23)
        public Builder setRequiresDeviceIdle(boolean requiresDeviceIdle) {
            this.mRequiresDeviceIdle = requiresDeviceIdle;
            return this;
        }

        @NonNull
        public Builder setRequiresStorageNotLow(boolean requiresStorageNotLow) {
            this.mRequiresStorageNotLow = requiresStorageNotLow;
            return this;
        }

        @NonNull
        @T(24)
        public Builder setTriggerContentMaxDelay(long duration, @NonNull TimeUnit timeUnit) {
            this.mTriggerContentMaxDelay = timeUnit.toMillis(duration);
            return this;
        }

        @NonNull
        @T(24)
        public Builder setTriggerContentUpdateDelay(long duration, @NonNull TimeUnit timeUnit) {
            this.mTriggerContentUpdateDelay = timeUnit.toMillis(duration);
            return this;
        }

        @NonNull
        @T(26)
        public Builder setTriggerContentMaxDelay(Duration duration) {
            this.mTriggerContentMaxDelay = duration.toMillis();
            return this;
        }

        @NonNull
        @T(26)
        public Builder setTriggerContentUpdateDelay(Duration duration) {
            this.mTriggerContentUpdateDelay = duration.toMillis();
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder(@NonNull Constraints constraints) {
            this.mRequiresCharging = false;
            this.mRequiresDeviceIdle = false;
            this.mRequiredNetworkType = NetworkType.NOT_REQUIRED;
            this.mRequiresBatteryNotLow = false;
            this.mRequiresStorageNotLow = false;
            this.mTriggerContentUpdateDelay = -1L;
            this.mTriggerContentMaxDelay = -1L;
            this.mContentUriTriggers = new b();
            this.mRequiresCharging = constraints.f120210b;
            int i10 = Build.VERSION.SDK_INT;
            this.mRequiresDeviceIdle = constraints.f120211c;
            this.mRequiredNetworkType = constraints.f120209a;
            this.mRequiresBatteryNotLow = constraints.f120212d;
            this.mRequiresStorageNotLow = constraints.f120213e;
            if (i10 >= 24) {
                this.mTriggerContentUpdateDelay = constraints.f120214f;
                this.mTriggerContentMaxDelay = constraints.f120215g;
                this.mContentUriTriggers = constraints.f120216h;
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Constraints() {
        this.f120209a = NetworkType.NOT_REQUIRED;
        this.f120214f = -1L;
        this.f120215g = -1L;
        this.f120216h = new b();
    }

    @NonNull
    @T(24)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public b a() {
        return this.f120216h;
    }

    @NonNull
    public NetworkType b() {
        return this.f120209a;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public long c() {
        return this.f120214f;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public long d() {
        return this.f120215g;
    }

    @T(24)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean e() {
        return this.f120216h.f120256a.size() > 0;
    }

    public boolean equals(Object o10) {
        if (this == o10) {
            return true;
        }
        if (o10 == null || Constraints.class != o10.getClass()) {
            return false;
        }
        Constraints constraints = (Constraints) o10;
        if (this.f120210b == constraints.f120210b && this.f120211c == constraints.f120211c && this.f120212d == constraints.f120212d && this.f120213e == constraints.f120213e && this.f120214f == constraints.f120214f && this.f120215g == constraints.f120215g && this.f120209a == constraints.f120209a) {
            return this.f120216h.equals(constraints.f120216h);
        }
        return false;
    }

    public boolean f() {
        return this.f120212d;
    }

    public boolean g() {
        return this.f120210b;
    }

    @T(23)
    public boolean h() {
        return this.f120211c;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.f120209a.hashCode() * 31) + (this.f120210b ? 1 : 0)) * 31) + (this.f120211c ? 1 : 0)) * 31) + (this.f120212d ? 1 : 0)) * 31) + (this.f120213e ? 1 : 0)) * 31;
        long j10 = this.f120214f;
        int i10 = (iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f120215g;
        return this.f120216h.f120256a.hashCode() + ((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31);
    }

    public boolean i() {
        return this.f120213e;
    }

    @T(24)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void j(@Nullable b mContentUriTriggers) {
        this.f120216h = mContentUriTriggers;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void k(@NonNull NetworkType requiredNetworkType) {
        this.f120209a = requiredNetworkType;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void l(boolean requiresBatteryNotLow) {
        this.f120212d = requiresBatteryNotLow;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void m(boolean requiresCharging) {
        this.f120210b = requiresCharging;
    }

    @T(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void n(boolean requiresDeviceIdle) {
        this.f120211c = requiresDeviceIdle;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void o(boolean requiresStorageNotLow) {
        this.f120213e = requiresStorageNotLow;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void p(long triggerContentUpdateDelay) {
        this.f120214f = triggerContentUpdateDelay;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void q(long triggerMaxContentDelay) {
        this.f120215g = triggerMaxContentDelay;
    }

    public Constraints(Builder builder) {
        this.f120209a = NetworkType.NOT_REQUIRED;
        this.f120214f = -1L;
        this.f120215g = -1L;
        this.f120216h = new b();
        this.f120210b = builder.mRequiresCharging;
        int i10 = Build.VERSION.SDK_INT;
        this.f120211c = builder.mRequiresDeviceIdle;
        this.f120209a = builder.mRequiredNetworkType;
        this.f120212d = builder.mRequiresBatteryNotLow;
        this.f120213e = builder.mRequiresStorageNotLow;
        if (i10 >= 24) {
            this.f120216h = builder.mContentUriTriggers;
            this.f120214f = builder.mTriggerContentUpdateDelay;
            this.f120215g = builder.mTriggerContentMaxDelay;
        }
    }

    public Constraints(@NonNull Constraints other) {
        this.f120209a = NetworkType.NOT_REQUIRED;
        this.f120214f = -1L;
        this.f120215g = -1L;
        this.f120216h = new b();
        this.f120210b = other.f120210b;
        this.f120211c = other.f120211c;
        this.f120209a = other.f120209a;
        this.f120212d = other.f120212d;
        this.f120213e = other.f120213e;
        this.f120216h = other.f120216h;
    }
}
