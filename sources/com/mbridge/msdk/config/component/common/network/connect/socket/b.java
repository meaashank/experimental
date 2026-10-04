package com.mbridge.msdk.config.component.common.network.connect.socket;

import android.text.TextUtils;
import androidx.core.view.C2462i0;
import com.mbridge.msdk.config.component.common.express.node.m;
import com.mbridge.msdk.config.component.common.network.listener.EventListenerTCP;
import com.mbridge.msdk.foundation.tools.q0;
import com.prism.gaia.download.j;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.jacoco.core.runtime.AgentOptions;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f154342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicInteger f154343b = new AtomicInteger(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f154344c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Socket f154345d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private OutputStream f154346e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private InputStream f154347f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.mbridge.msdk.config.component.nori.model.a f154348g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.result.a f154349h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.a f154350i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.retry.a f154351j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private EventListenerTCP f154352k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f154353l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f154354m;

    public b(com.mbridge.msdk.config.component.nori.model.a aVar, com.mbridge.msdk.config.component.common.network.result.a aVar2, com.mbridge.msdk.config.component.common.network.a aVar3) {
        this.f154348g = aVar;
        this.f154350i = aVar3;
        this.f154349h = aVar2;
        this.f154352k = new EventListenerTCP(aVar2.b());
    }

    private void b(String str) throws IOException {
        byte[] bArrA;
        try {
            EventListenerTCP eventListenerTCP = this.f154352k;
            if (eventListenerTCP != null) {
                eventListenerTCP.requestHeadersStart();
            }
            this.f154353l = false;
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[8]);
            byteBufferWrap.order(ByteOrder.BIG_ENDIAN);
            byteBufferWrap.put((byte) 2);
            if (TextUtils.isEmpty(str)) {
                byteBufferWrap.put((byte) 1);
            } else {
                byteBufferWrap.put(this.f154353l ? (byte) 3 : (byte) 2);
            }
            byteBufferWrap.putShort((short) this.f154343b.getAndIncrement());
            if (TextUtils.isEmpty(str)) {
                byteBufferWrap.putInt(0);
                bArrA = null;
            } else {
                bArrA = this.f154353l ? a(str) : str.getBytes();
                byteBufferWrap.putInt(bArrA != null ? bArrA.length : 0);
            }
            this.f154346e.write(byteBufferWrap.array());
            EventListenerTCP eventListenerTCP2 = this.f154352k;
            if (eventListenerTCP2 != null) {
                eventListenerTCP2.requestHeadersEnd();
            }
            if (bArrA != null) {
                EventListenerTCP eventListenerTCP3 = this.f154352k;
                if (eventListenerTCP3 != null) {
                    eventListenerTCP3.requestBodyStart();
                }
                this.f154346e.write(bArrA);
                EventListenerTCP eventListenerTCP4 = this.f154352k;
                if (eventListenerTCP4 != null) {
                    eventListenerTCP4.requestBodyEnd(bArrA.length);
                }
            }
            this.f154346e.flush();
        } catch (IOException e10) {
            q0.b("JavaSocketConnection", "Failed to send request: " + e10.getMessage());
            throw new IOException("Failed to send request: " + e10.getMessage(), e10);
        }
    }

    private com.mbridge.msdk.config.component.common.network.result.a d() {
        try {
            JSONObject jSONObjectG = g();
            f();
            b(jSONObjectG.toString());
            return i();
        } catch (ConnectException e10) {
            return a(1002, 1002, "Connection refused: " + e10.getMessage());
        } catch (SocketTimeoutException e11) {
            return a(1001, 1001, "Connection timeout: " + e11.getMessage());
        } catch (UnknownHostException e12) {
            return a(2001, 2001, "Host unreachable: " + e12.getMessage());
        } catch (IOException e13) {
            return a(2003, 2003, "Network error: " + e13.getMessage());
        } catch (Exception e14) {
            return a(1999, 1999, "Unknown error: " + e14.getMessage());
        }
    }

    private void f() throws IOException {
        try {
            try {
                try {
                    EventListenerTCP eventListenerTCP = this.f154352k;
                    if (eventListenerTCP != null) {
                        eventListenerTCP.dnsStart();
                    }
                    this.f154345d = new Socket();
                    InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f154342a, this.f154348g.j());
                    if (inetSocketAddress.isUnresolved()) {
                        throw new IOException("Cannot resolve host: " + this.f154342a);
                    }
                    EventListenerTCP eventListenerTCP2 = this.f154352k;
                    if (eventListenerTCP2 != null) {
                        eventListenerTCP2.dnsEnd(this.f154342a, Arrays.asList(inetSocketAddress.getAddress()));
                    }
                    this.f154345d.setSoTimeout(30000);
                    EventListenerTCP eventListenerTCP3 = this.f154352k;
                    if (eventListenerTCP3 != null) {
                        eventListenerTCP3.connectStart(inetSocketAddress);
                    }
                    this.f154345d.connect(inetSocketAddress, 30000);
                    EventListenerTCP eventListenerTCP4 = this.f154352k;
                    if (eventListenerTCP4 != null) {
                        eventListenerTCP4.connectEnd(inetSocketAddress);
                    }
                    this.f154346e = this.f154345d.getOutputStream();
                    this.f154347f = this.f154345d.getInputStream();
                    q0.a("JavaSocketConnection", "Socket connected to " + this.f154342a + com.prism.gaia.server.accounts.b.f166434b0);
                    Socket socket = this.f154345d;
                    if (socket == null || !socket.isConnected()) {
                        b();
                    }
                } catch (ConnectException e10) {
                    EventListenerTCP eventListenerTCP5 = this.f154352k;
                    if (eventListenerTCP5 != null) {
                        eventListenerTCP5.connectFailed(new InetSocketAddress(this.f154342a, this.f154348g.j()), e10);
                    }
                    throw new IOException("Connection refused", e10);
                } catch (UnknownHostException e11) {
                    EventListenerTCP eventListenerTCP6 = this.f154352k;
                    if (eventListenerTCP6 != null) {
                        eventListenerTCP6.connectFailed(new InetSocketAddress(this.f154342a, this.f154348g.j()), e11);
                    }
                    throw new IOException("Host unreachable", e11);
                }
            } catch (SocketTimeoutException e12) {
                EventListenerTCP eventListenerTCP7 = this.f154352k;
                if (eventListenerTCP7 != null) {
                    eventListenerTCP7.connectFailed(new InetSocketAddress(this.f154342a, this.f154348g.j()), e12);
                }
                throw new IOException("Connection timeout", e12);
            } catch (IOException e13) {
                EventListenerTCP eventListenerTCP8 = this.f154352k;
                if (eventListenerTCP8 != null) {
                    eventListenerTCP8.connectFailed(new InetSocketAddress(this.f154342a, this.f154348g.j()), e13);
                }
                throw new IOException("Connection failed", e13);
            }
        } catch (Throwable th) {
            Socket socket2 = this.f154345d;
            if (socket2 == null || !socket2.isConnected()) {
                b();
            }
            throw th;
        }
    }

    private JSONObject g() {
        JSONObject jSONObject = new JSONObject();
        try {
            this.f154342a = com.mbridge.msdk.foundation.same.net.utils.d.h().f156494m;
            int iJ = this.f154348g.j();
            Map<String, Object> mapB = this.f154348g.b();
            JSONObject jSONObject2 = new JSONObject();
            if (mapB != null) {
                for (Map.Entry<String, Object> entry : mapB.entrySet()) {
                    jSONObject2.put(entry.getKey(), entry.getValue());
                }
            }
            jSONObject.put(j.b.a.f164786e, jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(Hd.d.f50815k, this.f154342a);
            jSONObject3.put(AgentOptions.PORT, iJ);
            Map<String, Object> mapA = this.f154348g.a();
            if (mapA != null) {
                JSONObject jSONObject4 = new JSONObject();
                for (Map.Entry<String, Object> entry2 : mapA.entrySet()) {
                    jSONObject4.put(entry2.getKey(), entry2.getValue());
                }
                jSONObject3.put("data", jSONObject4);
            }
            jSONObject.put("body", jSONObject3);
            return jSONObject;
        } catch (Exception e10) {
            m.a(e10, new StringBuilder("Failed to prepare request content: "), "JavaSocketConnection");
            return jSONObject;
        }
    }

    private void h() {
        if (this.f154350i == null) {
            return;
        }
        EventListenerTCP eventListenerTCP = this.f154352k;
        if (eventListenerTCP != null) {
            eventListenerTCP.callEnd();
        }
        if (com.mbridge.msdk.config.component.common.util.c.a(this.f154349h.g())) {
            this.f154350i.b(this.f154349h);
            return;
        }
        if (this.f154349h.g() == 200) {
            this.f154350i.c(this.f154349h);
            com.mbridge.msdk.config.component.common.network.retry.a aVar = this.f154351j;
            if (aVar != null) {
                aVar.a();
                return;
            }
            return;
        }
        com.mbridge.msdk.config.component.common.network.retry.a aVar2 = this.f154351j;
        if (aVar2 != null) {
            aVar2.b();
        } else if (this.f154348g.g() > 0) {
            new com.mbridge.msdk.config.component.common.network.retry.c(this.f154354m, this.f154348g, this.f154350i, this.f154349h).c();
        } else {
            this.f154350i.d(this.f154349h);
        }
    }

    private com.mbridge.msdk.config.component.common.network.result.a i() {
        try {
            EventListenerTCP eventListenerTCP = this.f154352k;
            if (eventListenerTCP != null) {
                eventListenerTCP.responseHeadersStart();
            }
            byte[] bArr = new byte[8];
            if (this.f154347f.read(bArr) != 8) {
                return a(C2462i0.f111921j, C2462i0.f111921j, "Failed to read response header");
            }
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            byteBufferWrap.order(ByteOrder.BIG_ENDIAN);
            if (byteBufferWrap.get() != 2) {
                return a(C2462i0.f111921j, C2462i0.f111921j, "Invalid protocol version");
            }
            byte b10 = byteBufferWrap.get();
            byteBufferWrap.getShort();
            int i10 = byteBufferWrap.getInt();
            EventListenerTCP eventListenerTCP2 = this.f154352k;
            if (eventListenerTCP2 != null) {
                eventListenerTCP2.responseHeadersEnd();
            }
            if (i10 > 0) {
                EventListenerTCP eventListenerTCP3 = this.f154352k;
                if (eventListenerTCP3 != null) {
                    eventListenerTCP3.responseBodyStart();
                }
                boolean z10 = false;
                boolean z11 = b10 == 3;
                byte[] bArr2 = new byte[i10];
                new DataInputStream(this.f154347f).readFully(bArr2);
                if (i10 > 2) {
                    if (((bArr2[0] << 8) | (bArr2[1] & 255)) == 8075) {
                        z10 = true;
                    }
                }
                try {
                    this.f154349h.b((z11 && z10) ? a(bArr2) : new String(bArr2));
                    this.f154349h.c(200);
                    this.f154349h.b(1);
                    EventListenerTCP eventListenerTCP4 = this.f154352k;
                    if (eventListenerTCP4 != null) {
                        eventListenerTCP4.responseBodyEnd(i10);
                    }
                } catch (Exception e10) {
                    return a(1010, 1010, "Failed to process response data: " + e10.getMessage());
                }
            } else {
                this.f154349h.c(200);
                this.f154349h.b(1);
            }
            return this.f154349h;
        } catch (SocketTimeoutException e11) {
            return a(1004, 1004, "Read timeout: " + e11.getMessage());
        } catch (IOException e12) {
            return a(C2462i0.f111919h, C2462i0.f111919h, "Failed to read response: " + e12.getMessage());
        } catch (Exception e13) {
            return a(1999, 1999, "Unknown error while processing response: " + e13.getMessage());
        }
    }

    public void a(com.mbridge.msdk.config.component.common.network.retry.a aVar) {
        this.f154351j = aVar;
    }

    public void c(String str) {
        this.f154354m = str;
    }

    public EventListenerTCP e() {
        return this.f154352k;
    }

    @Override // java.lang.Runnable
    public void run() {
        c();
    }

    private void c() {
        this.f154349h = d();
        if (this.f154344c) {
            a(1999, 1999, "Request cancelled");
        }
        h();
    }

    public void a() {
        this.f154344c = true;
        b();
    }

    private byte[] a(String str) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        gZIPOutputStream.write(str.getBytes());
        gZIPOutputStream.close();
        return byteArrayOutputStream.toByteArray();
    }

    private String a(byte[] bArr) throws IOException {
        if (bArr != null && bArr.length != 0) {
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr2 = new byte[1024];
                while (true) {
                    int i10 = gZIPInputStream.read(bArr2);
                    if (i10 > 0) {
                        byteArrayOutputStream.write(bArr2, 0, i10);
                    } else {
                        gZIPInputStream.close();
                        byteArrayInputStream.close();
                        byteArrayOutputStream.close();
                        return byteArrayOutputStream.toString();
                    }
                }
            } catch (IOException e10) {
                q0.b("JavaSocketConnection", "Failed to decompress GZIP data: " + e10.getMessage());
                throw e10;
            }
        } else {
            return "";
        }
    }

    private com.mbridge.msdk.config.component.common.network.result.a a(int i10, int i11, String str) {
        this.f154349h.a(str);
        this.f154349h.c(i10);
        this.f154349h.a(i11);
        this.f154349h.b(0);
        EventListenerTCP eventListenerTCP = this.f154352k;
        if (eventListenerTCP != null) {
            eventListenerTCP.callFailed(new IOException(str));
        }
        return this.f154349h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void b() {
        OutputStream outputStream = this.f154346e;
        try {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e10) {
                    q0.b("JavaSocketConnection", "Error closing output stream: " + e10.getMessage());
                }
            }
            InputStream inputStream = this.f154347f;
            if (inputStream != null) {
                try {
                    try {
                        inputStream.close();
                    } catch (IOException e11) {
                        q0.b("JavaSocketConnection", "Error closing input stream: " + e11.getMessage());
                    }
                } finally {
                    this.f154347f = null;
                }
            }
            Socket socket = this.f154345d;
            try {
                if (socket != null) {
                    try {
                        socket.close();
                    } catch (IOException e12) {
                        q0.b("JavaSocketConnection", "Error closing socket: " + e12.getMessage());
                    }
                }
                q0.a("JavaSocketConnection", "All resources closed");
            } finally {
                this.f154345d = null;
            }
        } finally {
            this.f154346e = null;
        }
    }
}
