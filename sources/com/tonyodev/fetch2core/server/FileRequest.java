package com.tonyodev.fetch2core.server;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.collection.C1550p;
import androidx.compose.animation.C1635o;
import androidx.compose.foundation.layout.C1713x0;
import androidx.compose.foundation.text.modifiers.l;
import androidx.room.F;
import com.tonyodev.fetch2core.Extras;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public final class FileRequest implements Parcelable, Serializable {

    @NotNull
    public static final String CATALOG_FILE = "/Catalog.json";
    public static final long CATALOG_ID = -1;

    @NotNull
    public static final String CATALOG_NAME = "Catalog.json";

    @NotNull
    public static final a CREATOR = new a();

    @NotNull
    public static final String FIELD_AUTHORIZATION = "Authorization";

    @NotNull
    public static final String FIELD_CLIENT = "Client";

    @NotNull
    public static final String FIELD_EXTRAS = "Extras";

    @NotNull
    public static final String FIELD_FILE_RESOURCE_ID = "FileResourceId";

    @NotNull
    public static final String FIELD_PAGE = "Page";

    @NotNull
    public static final String FIELD_PERSIST_CONNECTION = "Persist-Connection";

    @NotNull
    public static final String FIELD_RANGE_END = "Range-End";

    @NotNull
    public static final String FIELD_RANGE_START = "Range-Start";

    @NotNull
    public static final String FIELD_SIZE = "Size";

    @NotNull
    public static final String FIELD_TYPE = "Type";
    public static final int TYPE_CATALOG = 2;
    public static final int TYPE_FILE = 1;
    public static final int TYPE_INVALID = -1;
    public static final int TYPE_PING = 0;

    @NotNull
    private final String authorization;

    @NotNull
    private final String client;

    @NotNull
    private final Extras extras;

    @NotNull
    private final String fileResourceId;
    private final int page;
    private final boolean persistConnection;
    private final long rangeEnd;
    private final long rangeStart;
    private final int size;
    private final int type;

    public static final class a implements Parcelable.Creator<FileRequest> {
        public a() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public FileRequest createFromParcel(@NotNull Parcel source) {
            G.p(source, "source");
            int i10 = source.readInt();
            String string = source.readString();
            if (string == null) {
                string = "";
            }
            long j10 = source.readLong();
            long j11 = source.readLong();
            String string2 = source.readString();
            if (string2 == null) {
                string2 = "";
            }
            String string3 = source.readString();
            if (string3 == null) {
                string3 = "";
            }
            Serializable serializable = source.readSerializable();
            G.n(serializable, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.String>");
            return new FileRequest(i10, string, j10, j11, string2, string3, new Extras((HashMap) serializable), source.readInt(), source.readInt(), source.readInt() == 1);
        }

        @NotNull
        public FileRequest[] d(int i10) {
            return new FileRequest[i10];
        }

        @Override // android.os.Parcelable.Creator
        public FileRequest[] newArray(int i10) {
            return new FileRequest[i10];
        }

        public a(C4969v c4969v) {
        }
    }

    public FileRequest() {
        this(0, null, 0L, 0L, null, null, null, 0, 0, false, 1023, null);
    }

    public static /* synthetic */ FileRequest copy$default(FileRequest fileRequest, int i10, String str, long j10, long j11, String str2, String str3, Extras extras, int i11, int i12, boolean z10, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i10 = fileRequest.type;
        }
        if ((i13 & 2) != 0) {
            str = fileRequest.fileResourceId;
        }
        if ((i13 & 4) != 0) {
            j10 = fileRequest.rangeStart;
        }
        if ((i13 & 8) != 0) {
            j11 = fileRequest.rangeEnd;
        }
        if ((i13 & 16) != 0) {
            str2 = fileRequest.authorization;
        }
        if ((i13 & 32) != 0) {
            str3 = fileRequest.client;
        }
        if ((i13 & 64) != 0) {
            extras = fileRequest.extras;
        }
        if ((i13 & 128) != 0) {
            i11 = fileRequest.page;
        }
        if ((i13 & 256) != 0) {
            i12 = fileRequest.size;
        }
        if ((i13 & 512) != 0) {
            z10 = fileRequest.persistConnection;
        }
        int i14 = i12;
        boolean z11 = z10;
        long j12 = j11;
        long j13 = j10;
        return fileRequest.copy(i10, str, j13, j12, str2, str3, extras, i11, i14, z11);
    }

    public final int component1() {
        return this.type;
    }

    public final boolean component10() {
        return this.persistConnection;
    }

    @NotNull
    public final String component2() {
        return this.fileResourceId;
    }

    public final long component3() {
        return this.rangeStart;
    }

    public final long component4() {
        return this.rangeEnd;
    }

    @NotNull
    public final String component5() {
        return this.authorization;
    }

    @NotNull
    public final String component6() {
        return this.client;
    }

    @NotNull
    public final Extras component7() {
        return this.extras;
    }

    public final int component8() {
        return this.page;
    }

    public final int component9() {
        return this.size;
    }

    @NotNull
    public final FileRequest copy(int i10, @NotNull String fileResourceId, long j10, long j11, @NotNull String authorization, @NotNull String client, @NotNull Extras extras, int i11, int i12, boolean z10) {
        G.p(fileResourceId, "fileResourceId");
        G.p(authorization, "authorization");
        G.p(client, "client");
        G.p(extras, "extras");
        return new FileRequest(i10, fileResourceId, j10, j11, authorization, client, extras, i11, i12, z10);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FileRequest)) {
            return false;
        }
        FileRequest fileRequest = (FileRequest) obj;
        return this.type == fileRequest.type && G.g(this.fileResourceId, fileRequest.fileResourceId) && this.rangeStart == fileRequest.rangeStart && this.rangeEnd == fileRequest.rangeEnd && G.g(this.authorization, fileRequest.authorization) && G.g(this.client, fileRequest.client) && G.g(this.extras, fileRequest.extras) && this.page == fileRequest.page && this.size == fileRequest.size && this.persistConnection == fileRequest.persistConnection;
    }

    @NotNull
    public final String getAuthorization() {
        return this.authorization;
    }

    @NotNull
    public final String getClient() {
        return this.client;
    }

    @NotNull
    public final Extras getExtras() {
        return this.extras;
    }

    @NotNull
    public final String getFileResourceId() {
        return this.fileResourceId;
    }

    public final int getPage() {
        return this.page;
    }

    public final boolean getPersistConnection() {
        return this.persistConnection;
    }

    public final long getRangeEnd() {
        return this.rangeEnd;
    }

    public final long getRangeStart() {
        return this.rangeStart;
    }

    public final int getSize() {
        return this.size;
    }

    @NotNull
    public final String getToJsonString() {
        StringBuilder sb2 = new StringBuilder("{\"Type\":");
        sb2.append(this.type);
        sb2.append(",\"FileResourceId\":");
        sb2.append("\"" + this.fileResourceId + "\"");
        sb2.append(",\"Range-Start\":");
        sb2.append(this.rangeStart);
        sb2.append(",\"Range-End\":");
        sb2.append(this.rangeEnd);
        sb2.append(",\"Authorization\":");
        sb2.append("\"" + this.authorization + "\"");
        sb2.append(",\"Client\":");
        sb2.append("\"" + this.client + "\"");
        sb2.append(",\"Extras\":");
        sb2.append(this.extras.toJSONString());
        sb2.append(",\"Page\":");
        sb2.append(this.page);
        sb2.append(",\"Size\":");
        sb2.append(this.size);
        sb2.append(",\"Persist-Connection\":");
        sb2.append(this.persistConnection);
        sb2.append('}');
        String string = sb2.toString();
        G.o(string, "toString(...)");
        return string;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return C1635o.a(this.persistConnection) + ((((((this.extras.hashCode() + l.a(this.client, l.a(this.authorization, (C1550p.a(this.rangeEnd) + ((C1550p.a(this.rangeStart) + l.a(this.fileResourceId, this.type * 31, 31)) * 31)) * 31, 31), 31)) * 31) + this.page) * 31) + this.size) * 31);
    }

    @NotNull
    public String toString() {
        int i10 = this.type;
        String str = this.fileResourceId;
        long j10 = this.rangeStart;
        long j11 = this.rangeEnd;
        String str2 = this.authorization;
        String str3 = this.client;
        Extras extras = this.extras;
        int i11 = this.page;
        int i12 = this.size;
        boolean z10 = this.persistConnection;
        StringBuilder sb2 = new StringBuilder("FileRequest(type=");
        sb2.append(i10);
        sb2.append(", fileResourceId=");
        sb2.append(str);
        sb2.append(", rangeStart=");
        sb2.append(j10);
        C1713x0.a(sb2, ", rangeEnd=", j11, ", authorization=");
        F.a(sb2, str2, ", client=", str3, ", extras=");
        sb2.append(extras);
        sb2.append(", page=");
        sb2.append(i11);
        sb2.append(", size=");
        sb2.append(i12);
        sb2.append(", persistConnection=");
        sb2.append(z10);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int i10) {
        G.p(dest, "dest");
        dest.writeInt(this.type);
        dest.writeString(this.fileResourceId);
        dest.writeLong(this.rangeStart);
        dest.writeLong(this.rangeEnd);
        dest.writeString(this.authorization);
        dest.writeString(this.client);
        dest.writeSerializable(new HashMap(this.extras.getMap()));
        dest.writeInt(this.page);
        dest.writeInt(this.size);
        dest.writeInt(this.persistConnection ? 1 : 0);
    }

    public FileRequest(int i10, @NotNull String fileResourceId, long j10, long j11, @NotNull String authorization, @NotNull String client, @NotNull Extras extras, int i11, int i12, boolean z10) {
        G.p(fileResourceId, "fileResourceId");
        G.p(authorization, "authorization");
        G.p(client, "client");
        G.p(extras, "extras");
        this.type = i10;
        this.fileResourceId = fileResourceId;
        this.rangeStart = j10;
        this.rangeEnd = j11;
        this.authorization = authorization;
        this.client = client;
        this.extras = extras;
        this.page = i11;
        this.size = i12;
        this.persistConnection = z10;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FileRequest(int i10, String str, long j10, long j11, String str2, String str3, Extras extras, int i11, int i12, boolean z10, int i13, C4969v c4969v) {
        i10 = (i13 & 1) != 0 ? -1 : i10;
        str = (i13 & 2) != 0 ? "-1" : str;
        j10 = (i13 & 4) != 0 ? 0L : j10;
        j11 = (i13 & 8) != 0 ? -1L : j11;
        str2 = (i13 & 16) != 0 ? "" : str2;
        str3 = (i13 & 32) != 0 ? "" : str3;
        if ((i13 & 64) != 0) {
            Extras.CREATOR.getClass();
            extras = Extras.emptyExtras;
        }
        this(i10, str, j10, j11, str2, str3, extras, (i13 & 128) != 0 ? 0 : i11, (i13 & 256) != 0 ? 0 : i12, (i13 & 512) != 0 ? true : z10);
    }
}
