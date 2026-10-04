package com.tonyodev.fetch2;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.collection.C1550p;
import androidx.compose.foundation.layout.C1713x0;
import androidx.compose.foundation.text.modifiers.l;
import com.tonyodev.fetch2core.Extras;
import java.io.Serializable;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import kotlin.collections.n0;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public class CompletedDownload implements Parcelable, Serializable {

    @NotNull
    public static final a CREATOR = new a();

    @NotNull
    private Extras extras;
    private long fileByteSize;
    private int group;
    private long identifier;

    @Nullable
    private String tag;

    @NotNull
    private String url = "";

    @NotNull
    private String file = "";

    @NotNull
    private Map<String, String> headers = n0.z();
    private long created = Calendar.getInstance().getTimeInMillis();

    public static final class a implements Parcelable.Creator<CompletedDownload> {
        public a() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public CompletedDownload createFromParcel(@NotNull Parcel source) {
            G.p(source, "source");
            String string = source.readString();
            if (string == null) {
                string = "";
            }
            String string2 = source.readString();
            String str = string2 != null ? string2 : "";
            int i10 = source.readInt();
            long j10 = source.readLong();
            Serializable serializable = source.readSerializable();
            G.n(serializable, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
            String string3 = source.readString();
            long j11 = source.readLong();
            long j12 = source.readLong();
            Serializable serializable2 = source.readSerializable();
            G.n(serializable2, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
            CompletedDownload completedDownload = new CompletedDownload();
            completedDownload.setUrl(string);
            completedDownload.setFile(str);
            completedDownload.setGroup(i10);
            completedDownload.setFileByteSize(j10);
            completedDownload.setHeaders((Map) serializable);
            completedDownload.setTag(string3);
            completedDownload.setIdentifier(j11);
            completedDownload.setCreated(j12);
            completedDownload.setExtras(new Extras((Map) serializable2));
            return completedDownload;
        }

        @NotNull
        public CompletedDownload[] d(int i10) {
            return new CompletedDownload[i10];
        }

        @Override // android.os.Parcelable.Creator
        public CompletedDownload[] newArray(int i10) {
            return new CompletedDownload[i10];
        }

        public a(C4969v c4969v) {
        }
    }

    public CompletedDownload() {
        Extras.CREATOR.getClass();
        this.extras = Extras.emptyExtras;
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
        G.n(obj, "null cannot be cast to non-null type com.tonyodev.fetch2.CompletedDownload");
        CompletedDownload completedDownload = (CompletedDownload) obj;
        return G.g(this.url, completedDownload.url) && G.g(this.file, completedDownload.file) && this.group == completedDownload.group && G.g(this.headers, completedDownload.headers) && G.g(this.tag, completedDownload.tag) && this.identifier == completedDownload.identifier && this.created == completedDownload.created && G.g(this.extras, completedDownload.extras);
    }

    public final long getCreated() {
        return this.created;
    }

    @NotNull
    public final Extras getExtras() {
        return this.extras;
    }

    @NotNull
    public final String getFile() {
        return this.file;
    }

    public final long getFileByteSize() {
        return this.fileByteSize;
    }

    public final int getGroup() {
        return this.group;
    }

    @NotNull
    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    public final long getIdentifier() {
        return this.identifier;
    }

    @Nullable
    public final String getTag() {
        return this.tag;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int iHashCode = (this.headers.hashCode() + ((l.a(this.file, this.url.hashCode() * 31, 31) + this.group) * 31)) * 31;
        String str = this.tag;
        return this.extras.hashCode() + ((C1550p.a(this.created) + ((C1550p.a(this.identifier) + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    public final void setCreated(long j10) {
        this.created = j10;
    }

    public final void setExtras(@NotNull Extras extras) {
        G.p(extras, "<set-?>");
        this.extras = extras;
    }

    public final void setFile(@NotNull String str) {
        G.p(str, "<set-?>");
        this.file = str;
    }

    public final void setFileByteSize(long j10) {
        this.fileByteSize = j10;
    }

    public final void setGroup(int i10) {
        this.group = i10;
    }

    public final void setHeaders(@NotNull Map<String, String> map) {
        G.p(map, "<set-?>");
        this.headers = map;
    }

    public final void setIdentifier(long j10) {
        this.identifier = j10;
    }

    public final void setTag(@Nullable String str) {
        this.tag = str;
    }

    public final void setUrl(@NotNull String str) {
        G.p(str, "<set-?>");
        this.url = str;
    }

    @NotNull
    public String toString() {
        String str = this.url;
        String str2 = this.file;
        int i10 = this.group;
        Map<String, String> map = this.headers;
        String str3 = this.tag;
        long j10 = this.identifier;
        long j11 = this.created;
        Extras extras = this.extras;
        StringBuilder sbA = androidx.constraintlayout.core.parser.b.a("CompletedDownload(url='", str, "', file='", str2, "', groupId=");
        sbA.append(i10);
        sbA.append(", headers=");
        sbA.append(map);
        sbA.append(", tag=");
        sbA.append(str3);
        sbA.append(", identifier=");
        sbA.append(j10);
        C1713x0.a(sbA, ", created=", j11, ", extras=");
        sbA.append(extras);
        sbA.append(")");
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int i10) {
        G.p(dest, "dest");
        dest.writeString(this.url);
        dest.writeString(this.file);
        dest.writeInt(this.group);
        dest.writeLong(this.fileByteSize);
        dest.writeSerializable(new HashMap(this.headers));
        dest.writeString(this.tag);
        dest.writeLong(this.identifier);
        dest.writeLong(this.created);
        dest.writeSerializable(new HashMap(this.extras.getMap()));
    }
}
