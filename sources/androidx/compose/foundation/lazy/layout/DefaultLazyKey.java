package androidx.compose.foundation.lazy.layout;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.C1477d;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
final class DefaultLazyKey implements Parcelable {
    private final int index;

    @NotNull
    public static final b Companion = new b();

    @dd.g
    @NotNull
    public static final Parcelable.Creator<DefaultLazyKey> CREATOR = new a();

    public static final class a implements Parcelable.Creator<DefaultLazyKey> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public DefaultLazyKey createFromParcel(@NotNull Parcel parcel) {
            return new DefaultLazyKey(parcel.readInt());
        }

        @NotNull
        public DefaultLazyKey[] d(int i10) {
            return new DefaultLazyKey[i10];
        }

        @Override // android.os.Parcelable.Creator
        public DefaultLazyKey[] newArray(int i10) {
            return new DefaultLazyKey[i10];
        }
    }

    public static final class b {
        public b() {
        }

        public static /* synthetic */ void a() {
        }

        public b(C4969v c4969v) {
        }
    }

    public DefaultLazyKey(int i10) {
        this.index = i10;
    }

    private final int component1() {
        return this.index;
    }

    public static /* synthetic */ DefaultLazyKey copy$default(DefaultLazyKey defaultLazyKey, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = defaultLazyKey.index;
        }
        return defaultLazyKey.copy(i10);
    }

    @NotNull
    public final DefaultLazyKey copy(int i10) {
        return new DefaultLazyKey(i10);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DefaultLazyKey) && this.index == ((DefaultLazyKey) obj).index;
    }

    public int hashCode() {
        return this.index;
    }

    @NotNull
    public String toString() {
        return C1477d.a(new StringBuilder("DefaultLazyKey(index="), this.index, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i10) {
        parcel.writeInt(this.index);
    }
}
