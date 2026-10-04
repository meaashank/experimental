package z4;

import android.app.Application;
import androidx.compose.runtime.internal.r;
import com.cookiegames.smartcookie.p;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.List;
import kotlin.G;
import kotlin.I;
import kotlin.jvm.internal.C4969v;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.u;
import org.jacoco.core.runtime.AgentOptions;
import org.jetbrains.annotations.NotNull;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import p4.InterfaceC5390c;

/* JADX INFO: loaded from: classes3.dex */
@r(parameters = 0)
public final class h extends e {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f241242m = 8;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final String f241245k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public static final a f241241l = new a();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public static final G<XmlPullParser> f241243n = I.a(new g());

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public static String f241244o = "ISO-8859-1";

    public static final class a {
        public a() {
        }

        @NotNull
        public final String b() {
            return h.f241244o;
        }

        public final XmlPullParser c() {
            return (XmlPullParser) h.f241243n.getValue();
        }

        public final void e(@NotNull String str) {
            kotlin.jvm.internal.G.p(str, "<set-?>");
            h.f241244o = str;
        }

        public a(C4969v c4969v) {
        }

        public static /* synthetic */ void d() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(@NotNull hc.I<OkHttpClient> okHttpClient, @NotNull k requestFactory, @NotNull Application application, @NotNull InterfaceC5390c logger) {
        super(okHttpClient, requestFactory, "UTF-8", d4.g.e(application), logger);
        kotlin.jvm.internal.G.p(okHttpClient, "okHttpClient");
        kotlin.jvm.internal.G.p(requestFactory, "requestFactory");
        kotlin.jvm.internal.G.p(application, "application");
        kotlin.jvm.internal.G.p(logger, "logger");
        String string = application.getString(p.s.Kg);
        kotlin.jvm.internal.G.o(string, "getString(...)");
        this.f241245k = string;
    }

    public static final XmlPullParser o() throws XmlPullParserException {
        XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
        xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        return xmlPullParserFactoryNewInstance.newPullParser();
    }

    @Override // z4.e
    @NotNull
    public HttpUrl e(@NotNull String query, @NotNull String language) {
        kotlin.jvm.internal.G.p(query, "query");
        kotlin.jvm.internal.G.p(language, "language");
        return new HttpUrl.Builder().scheme("https").host("suggestqueries.google.com").encodedPath("/complete/search").addQueryParameter(AgentOptions.OUTPUT, "toolbar").addEncodedQueryParameter(CampaignEx.JSON_KEY_AD_Q, query).build();
    }

    @Override // z4.e
    @NotNull
    public List<T3.e> g(@NotNull u responseBody) throws Exception {
        kotlin.jvm.internal.G.p(responseBody, "responseBody");
        a aVar = f241241l;
        aVar.c().setInput(responseBody.d(), f241244o);
        ArrayList arrayList = new ArrayList();
        int eventType = aVar.c().getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                try {
                    a aVar2 = f241241l;
                    if ("suggestion".equals(aVar2.c().getName())) {
                        String attributeValue = aVar2.c().getAttributeValue(null, "data");
                        String str = this.f241245k + " \"" + attributeValue + "\"";
                        kotlin.jvm.internal.G.m(attributeValue);
                        arrayList.add(new T3.e(str, attributeValue));
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
            eventType = f241241l.c().next();
        }
        return arrayList;
    }
}
