package com.tonyodev.fetch2core;

import android.os.Parcel;
import android.os.Parcelable;
import dd.o;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import kotlin.collections.n0;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class Extras implements Parcelable, Serializable {

    @NotNull
    public static final a CREATOR = new a();

    @NotNull
    private static final Extras emptyExtras = new Extras(n0.z());

    @NotNull
    private final Map<String, String> data;

    public static final class a implements Parcelable.Creator<Extras> {
        public a() {
        }

        @o
        public static /* synthetic */ void e() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Extras createFromParcel(@NotNull Parcel source) {
            G.p(source, "source");
            Serializable serializable = source.readSerializable();
            G.n(serializable, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.String>");
            return new Extras((HashMap) serializable);
        }

        @NotNull
        public final Extras d() {
            return Extras.emptyExtras;
        }

        @NotNull
        public Extras[] f(int i10) {
            return new Extras[i10];
        }

        @Override // android.os.Parcelable.Creator
        public Extras[] newArray(int i10) {
            return new Extras[i10];
        }

        public a(C4969v c4969v) {
        }
    }

    public Extras(@NotNull Map<String, String> data) {
        G.p(data, "data");
        this.data = data;
    }

    @NotNull
    public static final Extras getEmptyExtras() {
        CREATOR.getClass();
        return emptyExtras;
    }

    @NotNull
    public Extras copy() {
        return new Extras(n0.D0(this.data));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getClass().equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        G.n(obj, "null cannot be cast to non-null type com.tonyodev.fetch2core.Extras");
        return G.g(this.data, ((Extras) obj).data);
    }

    public final boolean getBoolean(@NotNull String key, boolean z10) {
        G.p(key, "key");
        String str = this.data.get(key);
        return str != null ? Boolean.parseBoolean(str) : z10;
    }

    @NotNull
    public final Map<String, String> getData() {
        return this.data;
    }

    public final double getDouble(@NotNull String key, double d10) {
        G.p(key, "key");
        String str = this.data.get(key);
        return str != null ? Double.parseDouble(str) : d10;
    }

    public final float getFloat(@NotNull String key, float f10) {
        G.p(key, "key");
        String str = this.data.get(key);
        return str != null ? Float.parseFloat(str) : f10;
    }

    public final int getInt(@NotNull String key, int i10) {
        G.p(key, "key");
        String str = this.data.get(key);
        return str != null ? Integer.parseInt(str) : i10;
    }

    public final long getLong(@NotNull String key, long j10) {
        G.p(key, "key");
        String str = this.data.get(key);
        return str != null ? Long.parseLong(str) : j10;
    }

    @NotNull
    public final Map<String, String> getMap() {
        return n0.D0(this.data);
    }

    public final int getSize() {
        return this.data.size();
    }

    @NotNull
    public final String getString(@NotNull String key, @NotNull String defaultValue) {
        G.p(key, "key");
        G.p(defaultValue, "defaultValue");
        String str = this.data.get(key);
        return str == null ? defaultValue : str;
    }

    public int hashCode() {
        return this.data.hashCode();
    }

    public final boolean isEmpty() {
        return this.data.isEmpty();
    }

    public final boolean isNotEmpty() {
        return !this.data.isEmpty();
    }

    @NotNull
    public final JSONObject toJSONObject() {
        return isEmpty() ? new JSONObject() : new JSONObject(getMap());
    }

    @NotNull
    public final String toJSONString() {
        if (isEmpty()) {
            return Ib.b.f53002g;
        }
        String string = new JSONObject(getMap()).toString();
        G.m(string);
        return string;
    }

    @NotNull
    public final MutableExtras toMutableExtras() {
        return new MutableExtras(n0.J0(this.data));
    }

    @NotNull
    public String toString() {
        return toJSONString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int i10) {
        G.p(dest, "dest");
        dest.writeSerializable(new HashMap(this.data));
    }
}
