package com.tonyodev.fetch2;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.text.modifiers.l;
import com.tonyodev.fetch2core.Extras;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public class Request extends RequestInfo implements Parcelable, Serializable {

    @NotNull
    public static final a CREATOR = new a();

    @NotNull
    private final String file;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final int f194381id;

    @NotNull
    private final String url;

    @V({"SMAP\nRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Request.kt\ncom/tonyodev/fetch2/Request$CREATOR\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,120:1\n216#2,2:121\n*S KotlinDebug\n*F\n+ 1 Request.kt\ncom/tonyodev/fetch2/Request$CREATOR\n*L\n102#1:121,2\n*E\n"})
    public static final class a implements Parcelable.Creator<Request> {
        public a() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Request createFromParcel(@NotNull Parcel input) {
            G.p(input, "input");
            String string = input.readString();
            if (string == null) {
                string = "";
            }
            String string2 = input.readString();
            String str = string2 != null ? string2 : "";
            long j10 = input.readLong();
            int i10 = input.readInt();
            Serializable serializable = input.readSerializable();
            G.n(serializable, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
            Map map = (Map) serializable;
            Priority priorityA = Priority.Companion.a(input.readInt());
            NetworkType networkTypeA = NetworkType.Companion.a(input.readInt());
            String string3 = input.readString();
            EnqueueAction enqueueActionA = EnqueueAction.Companion.a(input.readInt());
            boolean z10 = input.readInt() == 1;
            Serializable serializable2 = input.readSerializable();
            G.n(serializable2, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
            Map map2 = (Map) serializable2;
            int i11 = input.readInt();
            Request request = new Request(string, str);
            request.setIdentifier(j10);
            request.setGroupId(i10);
            for (Map.Entry entry : map.entrySet()) {
                request.addHeader((String) entry.getKey(), (String) entry.getValue());
            }
            request.setPriority(priorityA);
            request.setNetworkType(networkTypeA);
            request.setTag(string3);
            request.setEnqueueAction(enqueueActionA);
            request.setDownloadOnEnqueue(z10);
            request.setExtras(new Extras(map2));
            request.setAutoRetryMaxAttempts(i11);
            return request;
        }

        @NotNull
        public Request[] d(int i10) {
            return new Request[i10];
        }

        @Override // android.os.Parcelable.Creator
        public Request[] newArray(int i10) {
            return new Request[i10];
        }

        public a(C4969v c4969v) {
        }
    }

    public Request(@NotNull String url, @NotNull String file) {
        G.p(url, "url");
        G.p(file, "file");
        this.url = url;
        this.file = file;
        this.f194381id = com.tonyodev.fetch2core.b.B(url, file);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.tonyodev.fetch2.RequestInfo
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getClass().equals(obj != null ? obj.getClass() : null) || !super.equals(obj)) {
            return false;
        }
        G.n(obj, "null cannot be cast to non-null type com.tonyodev.fetch2.Request");
        Request request = (Request) obj;
        return this.f194381id == request.f194381id && G.g(this.url, request.url) && G.g(this.file, request.file);
    }

    @NotNull
    public final String getFile() {
        return this.file;
    }

    @NotNull
    public final Uri getFileUri() {
        return com.tonyodev.fetch2core.b.q(this.file);
    }

    public final int getId() {
        return this.f194381id;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    @Override // com.tonyodev.fetch2.RequestInfo
    public int hashCode() {
        return this.file.hashCode() + l.a(this.url, ((super.hashCode() * 31) + this.f194381id) * 31, 31);
    }

    @Override // com.tonyodev.fetch2.RequestInfo
    @NotNull
    public String toString() {
        String str = this.url;
        String str2 = this.file;
        int i10 = this.f194381id;
        int groupId = getGroupId();
        Map<String, String> headers = getHeaders();
        Priority priority = getPriority();
        NetworkType networkType = getNetworkType();
        String tag = getTag();
        StringBuilder sbA = androidx.constraintlayout.core.parser.b.a("Request(url='", str, "', file='", str2, "', id=");
        androidx.viewpager.widget.a.a(sbA, i10, ", groupId=", groupId, ", headers=");
        sbA.append(headers);
        sbA.append(", priority=");
        sbA.append(priority);
        sbA.append(", networkType=");
        sbA.append(networkType);
        sbA.append(", tag=");
        sbA.append(tag);
        sbA.append(")");
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i10) {
        G.p(parcel, "parcel");
        parcel.writeString(this.url);
        parcel.writeString(this.file);
        parcel.writeLong(getIdentifier());
        parcel.writeInt(getGroupId());
        parcel.writeSerializable(new HashMap(getHeaders()));
        parcel.writeInt(getPriority().getValue());
        parcel.writeInt(getNetworkType().getValue());
        parcel.writeString(getTag());
        parcel.writeInt(getEnqueueAction().getValue());
        parcel.writeInt(getDownloadOnEnqueue() ? 1 : 0);
        parcel.writeSerializable(new HashMap(getExtras().getMap()));
        parcel.writeInt(getAutoRetryMaxAttempts());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Request(@NotNull String url, @NotNull Uri fileUri) {
        G.p(url, "url");
        G.p(fileUri, "fileUri");
        String string = fileUri.toString();
        G.o(string, "toString(...)");
        this(url, string);
    }
}
