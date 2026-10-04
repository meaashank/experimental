package androidx.compose.runtime;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
@androidx.compose.runtime.internal.r(parameters = 2)
public final class ParcelableSnapshotMutableState<T> extends SnapshotMutableStateImpl<T> implements Parcelable {
    public static final int $stable = 0;
    private static final int PolicyNeverEquals = 0;
    private static final int PolicyReferentialEquality = 2;
    private static final int PolicyStructuralEquality = 1;

    @NotNull
    public static final b Companion = new b();

    @dd.g
    @NotNull
    public static final Parcelable.Creator<ParcelableSnapshotMutableState<Object>> CREATOR = new a();

    public static final class a implements Parcelable.ClassLoaderCreator<ParcelableSnapshotMutableState<Object>> {
        @NotNull
        public ParcelableSnapshotMutableState<Object> c(@NotNull Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        @NotNull
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public ParcelableSnapshotMutableState<Object> createFromParcel(@NotNull Parcel parcel, @Nullable ClassLoader classLoader) {
            H1 h1A;
            if (classLoader == null) {
                classLoader = a.class.getClassLoader();
            }
            Object value = parcel.readValue(classLoader);
            int i10 = parcel.readInt();
            if (i10 == 0) {
                h1A = L1.a();
            } else if (i10 == 1) {
                h1A = L1.c();
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException(androidx.collection.N0.a("Unsupported MutableState policy ", i10, " was restored"));
                }
                h1A = L1.b();
            }
            return new ParcelableSnapshotMutableState<>(value, h1A);
        }

        @NotNull
        public ParcelableSnapshotMutableState<Object>[] e(int i10) {
            return new ParcelableSnapshotMutableState[i10];
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i10) {
            return new ParcelableSnapshotMutableState[i10];
        }

        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
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

    public ParcelableSnapshotMutableState(T t10, @NotNull H1<T> h12) {
        super(t10, h12);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i10) {
        int i11;
        parcel.writeValue(getValue());
        H1<T> policy = getPolicy();
        if (kotlin.jvm.internal.G.g(policy, L1.a())) {
            i11 = 0;
        } else if (kotlin.jvm.internal.G.g(policy, L1.c())) {
            i11 = 1;
        } else {
            if (!kotlin.jvm.internal.G.g(policy, L1.b())) {
                throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
            }
            i11 = 2;
        }
        parcel.writeInt(i11);
    }
}
