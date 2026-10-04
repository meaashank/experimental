package Kb;

import com.tonyodev.fetch2core.Extras;
import com.tonyodev.fetch2core.server.FileRequest;
import com.tonyodev.fetch2core.server.FileResponse;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@V({"SMAP\nFetchFileResourceTransporter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FetchFileResourceTransporter.kt\ncom/tonyodev/fetch2core/server/FetchFileResourceTransporter\n+ 2 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n*L\n1#1,211:1\n32#2,2:212\n*S KotlinDebug\n*F\n+ 1 FetchFileResourceTransporter.kt\ncom/tonyodev/fetch2core/server/FetchFileResourceTransporter\n*L\n68#1:212,2\n*E\n"})
public final class a implements b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Socket f58537c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public DataInputStream f58538d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public DataOutputStream f58539e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Object f58540f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f58541g;

    /* JADX WARN: Multi-variable type inference failed */
    public a() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // Kb.b
    @NotNull
    public FileRequest a() {
        Extras extras;
        FileRequest fileRequest;
        synchronized (this.f58540f) {
            try {
                h();
                i();
                DataInputStream dataInputStream = this.f58538d;
                if (dataInputStream == null) {
                    G.S("dataInput");
                    throw null;
                }
                JSONObject jSONObject = new JSONObject(dataInputStream.readUTF());
                int i10 = jSONObject.getInt(FileRequest.FIELD_TYPE);
                String string = jSONObject.getString(FileRequest.FIELD_FILE_RESOURCE_ID);
                long j10 = jSONObject.getLong(FileRequest.FIELD_RANGE_START);
                long j11 = jSONObject.getLong(FileRequest.FIELD_RANGE_END);
                String string2 = jSONObject.getString("Authorization");
                String string3 = jSONObject.getString(FileRequest.FIELD_CLIENT);
                try {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    JSONObject jSONObject2 = new JSONObject(jSONObject.getString(FileRequest.FIELD_EXTRAS));
                    Iterator<String> itKeys = jSONObject2.keys();
                    G.o(itKeys, "keys(...)");
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        linkedHashMap.put(next, jSONObject2.getString(next));
                    }
                    extras = new Extras(linkedHashMap);
                } catch (Exception unused) {
                    Extras.CREATOR.getClass();
                    extras = Extras.emptyExtras;
                }
                Extras extras2 = extras;
                int i11 = jSONObject.getInt(FileRequest.FIELD_PAGE);
                int i12 = jSONObject.getInt(FileRequest.FIELD_SIZE);
                if ((j10 < 0 || j10 > j11) && j11 > -1) {
                    j10 = 0;
                }
                if (j11 < 0) {
                    j11 = -1;
                }
                if (i11 < -1) {
                    i11 = -1;
                }
                int i13 = i12 < -1 ? -1 : i12;
                boolean z10 = jSONObject.getBoolean(FileRequest.FIELD_PERSIST_CONNECTION);
                G.m(string);
                G.m(string2);
                G.m(string3);
                fileRequest = new FileRequest(i10, string, j10, j11, string2, string3, extras2, i11, i13, z10);
            } catch (Throwable th) {
                throw th;
            }
        }
        return fileRequest;
    }

    @Override // Kb.c
    public void b(@NotNull FileResponse fileResponse) {
        G.p(fileResponse, "fileResponse");
        synchronized (this.f58540f) {
            h();
            i();
            DataOutputStream dataOutputStream = this.f58539e;
            if (dataOutputStream == null) {
                G.S("dataOutput");
                throw null;
            }
            dataOutputStream.writeUTF(fileResponse.getToJsonString());
            DataOutputStream dataOutputStream2 = this.f58539e;
            if (dataOutputStream2 == null) {
                G.S("dataOutput");
                throw null;
            }
            dataOutputStream2.flush();
        }
    }

    @Override // Kb.b
    public int c(@NotNull byte[] byteArray, int i10, int i11) {
        int i12;
        G.p(byteArray, "byteArray");
        synchronized (this.f58540f) {
            h();
            i();
            DataInputStream dataInputStream = this.f58538d;
            if (dataInputStream == null) {
                G.S("dataInput");
                throw null;
            }
            i12 = dataInputStream.read(byteArray, i10, i11);
        }
        return i12;
    }

    @Override // Kb.b
    public void close() {
        DataOutputStream dataOutputStream;
        DataInputStream dataInputStream;
        synchronized (this.f58540f) {
            try {
                if (!this.f58541g) {
                    this.f58541g = true;
                    try {
                        dataInputStream = this.f58538d;
                    } catch (Exception unused) {
                    }
                    if (dataInputStream == null) {
                        G.S("dataInput");
                        throw null;
                    }
                    dataInputStream.close();
                    try {
                        dataOutputStream = this.f58539e;
                    } catch (Exception unused2) {
                    }
                    if (dataOutputStream == null) {
                        G.S("dataOutput");
                        throw null;
                    }
                    dataOutputStream.close();
                    try {
                        this.f58537c.close();
                    } catch (Exception unused3) {
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // Kb.c
    public void d(@NotNull FileRequest fileRequest) {
        G.p(fileRequest, "fileRequest");
        synchronized (this.f58540f) {
            h();
            i();
            DataOutputStream dataOutputStream = this.f58539e;
            if (dataOutputStream == null) {
                G.S("dataOutput");
                throw null;
            }
            dataOutputStream.writeUTF(fileRequest.getToJsonString());
            DataOutputStream dataOutputStream2 = this.f58539e;
            if (dataOutputStream2 == null) {
                G.S("dataOutput");
                throw null;
            }
            dataOutputStream2.flush();
        }
    }

    @Override // Kb.b
    public void e(@NotNull SocketAddress socketAddress) {
        G.p(socketAddress, "socketAddress");
        synchronized (this.f58540f) {
            h();
            this.f58537c.connect(socketAddress);
            this.f58538d = new DataInputStream(this.f58537c.getInputStream());
            this.f58539e = new DataOutputStream(this.f58537c.getOutputStream());
        }
    }

    @Override // Kb.c
    public void f(@NotNull byte[] byteArray, int i10, int i11) {
        G.p(byteArray, "byteArray");
        synchronized (this.f58540f) {
            h();
            i();
            DataOutputStream dataOutputStream = this.f58539e;
            if (dataOutputStream == null) {
                G.S("dataOutput");
                throw null;
            }
            dataOutputStream.write(byteArray, i10, i11);
            DataOutputStream dataOutputStream2 = this.f58539e;
            if (dataOutputStream2 == null) {
                G.S("dataOutput");
                throw null;
            }
            dataOutputStream2.flush();
        }
    }

    @Override // Kb.b
    @NotNull
    public FileResponse g() {
        FileResponse fileResponse;
        synchronized (this.f58540f) {
            h();
            i();
            DataInputStream dataInputStream = this.f58538d;
            if (dataInputStream == null) {
                G.S("dataInput");
                throw null;
            }
            String utf = dataInputStream.readUTF();
            G.o(utf, "readUTF(...)");
            String lowerCase = utf.toLowerCase(Locale.ROOT);
            G.o(lowerCase, "toLowerCase(...)");
            JSONObject jSONObject = new JSONObject(lowerCase);
            int i10 = jSONObject.getInt("status");
            int i11 = jSONObject.getInt("type");
            int i12 = jSONObject.getInt("connection");
            long j10 = jSONObject.getLong(FileResponse.FIELD_DATE);
            long j11 = jSONObject.getLong("content-length");
            String string = jSONObject.getString(FileResponse.FIELD_MD5);
            String string2 = jSONObject.getString("sessionid");
            G.m(string);
            G.m(string2);
            fileResponse = new FileResponse(i10, i11, i12, j10, j11, string, string2);
        }
        return fileResponse;
    }

    @Override // Kb.b
    @NotNull
    public InputStream getInputStream() {
        DataInputStream dataInputStream;
        synchronized (this.f58540f) {
            h();
            i();
            dataInputStream = this.f58538d;
            if (dataInputStream == null) {
                G.S("dataInput");
                throw null;
            }
        }
        return dataInputStream;
    }

    @Override // Kb.b
    @NotNull
    public OutputStream getOutputStream() {
        DataOutputStream dataOutputStream;
        synchronized (this.f58540f) {
            h();
            i();
            dataOutputStream = this.f58539e;
            if (dataOutputStream == null) {
                G.S("dataOutput");
                throw null;
            }
        }
        return dataOutputStream;
    }

    public final void h() throws Exception {
        if (this.f58541g) {
            throw new Exception("FetchFileResourceTransporter is already closed.");
        }
    }

    public final void i() {
        if (this.f58538d == null) {
            G.S("dataInput");
            throw null;
        }
        if (this.f58539e != null) {
            return;
        }
        G.S("dataOutput");
        throw null;
    }

    @Override // Kb.b
    public boolean isClosed() {
        boolean z10;
        synchronized (this.f58540f) {
            z10 = this.f58541g;
        }
        return z10;
    }

    public a(@NotNull Socket client) {
        G.p(client, "client");
        this.f58537c = client;
        this.f58540f = new Object();
        if (client.isConnected() && !client.isClosed()) {
            this.f58538d = new DataInputStream(client.getInputStream());
            this.f58539e = new DataOutputStream(client.getOutputStream());
        }
        if (client.isClosed()) {
            this.f58541g = true;
        }
    }

    public /* synthetic */ a(Socket socket, int i10, C4969v c4969v) {
        this((i10 & 1) != 0 ? new Socket() : socket);
    }
}
