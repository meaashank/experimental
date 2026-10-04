package com.tonyodev.fetch2core;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.collection.C1550p;
import androidx.compose.animation.core.E0;
import androidx.compose.foundation.text.modifiers.l;
import androidx.compose.runtime.snapshots.z;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public final class FileResource implements Parcelable, Serializable {

    @NotNull
    public static final a CREATOR = new a();

    @NotNull
    private Extras extras;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private long f194463id;
    private long length;

    @NotNull
    private String md5;

    @NotNull
    private String file = "";

    @NotNull
    private String name = "";

    public static final class a implements Parcelable.Creator<FileResource> {
        public a() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public FileResource createFromParcel(@NotNull Parcel source) {
            G.p(source, "source");
            FileResource fileResource = new FileResource();
            fileResource.setId(source.readLong());
            String string = source.readString();
            if (string == null) {
                string = "";
            }
            fileResource.setName(string);
            fileResource.setLength(source.readLong());
            String string2 = source.readString();
            if (string2 == null) {
                string2 = "";
            }
            fileResource.setFile(string2);
            Serializable serializable = source.readSerializable();
            G.n(serializable, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.String>");
            fileResource.setExtras(new Extras((HashMap) serializable));
            String string3 = source.readString();
            fileResource.setMd5(string3 != null ? string3 : "");
            return fileResource;
        }

        @NotNull
        public FileResource[] d(int i10) {
            return new FileResource[i10];
        }

        @Override // android.os.Parcelable.Creator
        public FileResource[] newArray(int i10) {
            return new FileResource[i10];
        }

        public a(C4969v c4969v) {
        }
    }

    public FileResource() {
        Extras.CREATOR.getClass();
        this.extras = Extras.emptyExtras;
        this.md5 = "";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!FileResource.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        G.n(obj, "null cannot be cast to non-null type com.tonyodev.fetch2core.FileResource");
        FileResource fileResource = (FileResource) obj;
        return this.f194463id == fileResource.f194463id && this.length == fileResource.length && G.g(this.file, fileResource.file) && G.g(this.name, fileResource.name) && G.g(this.extras, fileResource.extras) && G.g(this.md5, fileResource.md5);
    }

    @NotNull
    public final Extras getExtras() {
        return this.extras;
    }

    @NotNull
    public final String getFile() {
        return this.file;
    }

    public final long getId() {
        return this.f194463id;
    }

    public final long getLength() {
        return this.length;
    }

    @NotNull
    public final String getMd5() {
        return this.md5;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.md5.hashCode() + ((this.extras.hashCode() + l.a(this.name, l.a(this.file, (C1550p.a(this.length) + (C1550p.a(this.f194463id) * 31)) * 31, 31), 31)) * 31);
    }

    public final void setExtras(@NotNull Extras value) {
        G.p(value, "value");
        this.extras = value.copy();
    }

    public final void setFile(@NotNull String str) {
        G.p(str, "<set-?>");
        this.file = str;
    }

    public final void setId(long j10) {
        this.f194463id = j10;
    }

    public final void setLength(long j10) {
        this.length = j10;
    }

    public final void setMd5(@NotNull String str) {
        G.p(str, "<set-?>");
        this.md5 = str;
    }

    public final void setName(@NotNull String str) {
        G.p(str, "<set-?>");
        this.name = str;
    }

    @NotNull
    public String toString() {
        long j10 = this.f194463id;
        long j11 = this.length;
        String str = this.file;
        String str2 = this.name;
        Extras extras = this.extras;
        String str3 = this.md5;
        StringBuilder sbA = z.a("FileResource(id=", j10, ", length=");
        sbA.append(j11);
        sbA.append(", file='");
        sbA.append(str);
        sbA.append("', name='");
        sbA.append(str2);
        sbA.append("', extras='");
        sbA.append(extras);
        return E0.a(sbA, "', md5='", str3, "')");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int i10) {
        G.p(dest, "dest");
        dest.writeLong(this.f194463id);
        dest.writeString(this.name);
        dest.writeLong(this.length);
        dest.writeString(this.file);
        dest.writeSerializable(new HashMap(this.extras.getMap()));
        dest.writeString(this.md5);
    }
}
