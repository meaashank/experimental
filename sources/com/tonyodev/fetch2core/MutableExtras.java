package com.tonyodev.fetch2core;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.n0;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public class MutableExtras extends Extras implements Serializable {

    @NotNull
    public static final a CREATOR = new a();

    @NotNull
    private final Map<String, String> mutableData;

    public static final class a implements Parcelable.Creator<MutableExtras> {
        public a() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public MutableExtras createFromParcel(@NotNull Parcel source) {
            G.p(source, "source");
            Serializable serializable = source.readSerializable();
            G.n(serializable, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.String>");
            return new MutableExtras(n0.J0((HashMap) serializable));
        }

        @NotNull
        public MutableExtras[] d(int i10) {
            return new MutableExtras[i10];
        }

        @Override // android.os.Parcelable.Creator
        public MutableExtras[] newArray(int i10) {
            return new MutableExtras[i10];
        }

        public a(C4969v c4969v) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MutableExtras() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final void clear() {
        this.mutableData.clear();
    }

    @Override // com.tonyodev.fetch2core.Extras, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.tonyodev.fetch2core.Extras
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getClass().equals(obj != null ? obj.getClass() : null) || !super.equals(obj)) {
            return false;
        }
        G.n(obj, "null cannot be cast to non-null type com.tonyodev.fetch2core.MutableExtras");
        return G.g(this.mutableData, ((MutableExtras) obj).mutableData);
    }

    @NotNull
    public final Map<String, String> getMutableData() {
        return this.mutableData;
    }

    @Override // com.tonyodev.fetch2core.Extras
    public int hashCode() {
        return this.mutableData.hashCode() + (super.hashCode() * 31);
    }

    public final void putBoolean(@NotNull String key, boolean z10) {
        G.p(key, "key");
        this.mutableData.put(key, String.valueOf(z10));
    }

    public final void putDouble(@NotNull String key, double d10) {
        G.p(key, "key");
        this.mutableData.put(key, String.valueOf(d10));
    }

    public final void putFloat(@NotNull String key, float f10) {
        G.p(key, "key");
        this.mutableData.put(key, String.valueOf(f10));
    }

    public final void putInt(@NotNull String key, int i10) {
        G.p(key, "key");
        this.mutableData.put(key, String.valueOf(i10));
    }

    public final void putLong(@NotNull String key, long j10) {
        G.p(key, "key");
        this.mutableData.put(key, String.valueOf(j10));
    }

    public final void putString(@NotNull String key, @NotNull String value) {
        G.p(key, "key");
        G.p(value, "value");
        this.mutableData.put(key, value);
    }

    @NotNull
    public final Extras toExtras() {
        return new Extras(n0.D0(this.mutableData));
    }

    @Override // com.tonyodev.fetch2core.Extras
    @NotNull
    public String toString() {
        return toJSONString();
    }

    @Override // com.tonyodev.fetch2core.Extras, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int i10) {
        G.p(dest, "dest");
        dest.writeSerializable(new HashMap(this.mutableData));
    }

    public /* synthetic */ MutableExtras(Map map, int i10, C4969v c4969v) {
        this((i10 & 1) != 0 ? new LinkedHashMap() : map);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutableExtras(@NotNull Map<String, String> mutableData) {
        super(mutableData);
        G.p(mutableData, "mutableData");
        this.mutableData = mutableData;
    }
}
