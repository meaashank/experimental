package androidx.compose.runtime;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
@androidx.compose.runtime.internal.r(parameters = 1)
public final class ParcelableSnapshotMutableLongState extends SnapshotMutableLongStateImpl implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final b Companion = new b();

    @dd.g
    @NotNull
    public static final Parcelable.Creator<ParcelableSnapshotMutableLongState> CREATOR = new a();

    public static final class a implements Parcelable.Creator<ParcelableSnapshotMutableLongState> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public ParcelableSnapshotMutableLongState createFromParcel(@NotNull Parcel parcel) {
            return new ParcelableSnapshotMutableLongState(parcel.readLong());
        }

        @NotNull
        public ParcelableSnapshotMutableLongState[] d(int i10) {
            return new ParcelableSnapshotMutableLongState[i10];
        }

        @Override // android.os.Parcelable.Creator
        public ParcelableSnapshotMutableLongState[] newArray(int i10) {
            return new ParcelableSnapshotMutableLongState[i10];
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

    public ParcelableSnapshotMutableLongState(long j10) {
        super(j10);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i10) {
        parcel.writeLong(getLongValue());
    }
}
