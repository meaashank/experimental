package com.mbridge.msdk.config.component.common.express;

import com.google.firebase.sessions.settings.RemoteSettings;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, Integer> f154216a = g.a(new Map.Entry[]{f.a("=", 0), f.a("+=", 0), f.a("-=", 0), f.a("*=", 0), f.a("/=", 0), f.a("%=", 0), f.a(com.mbridge.msdk.config.component.common.util.c.c("883"), 1), f.a(com.mbridge.msdk.config.component.common.util.c.c("882"), 2), f.a("==", 3), f.a("!=", 3), f.a(">", 4), f.a("<", 4), f.a(">=", 4), f.a("<=", 4), f.a(ScarConstants.IN_SIGNAL_KEY, 4), f.a("IN", 4), f.a("+", 5), f.a(com.prism.gaia.download.a.f164606q, 5), f.a("*", 6), f.a(RemoteSettings.FORWARD_SLASH_STRING, 6), f.a("%", 6)});

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<String> f154217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f154218c;

    private List<String> b(String str) {
        int i10;
        ArrayList arrayList = new ArrayList();
        int length = str.length();
        StringBuilder sb2 = new StringBuilder();
        int i11 = 0;
        boolean z10 = false;
        while (i11 < length) {
            char cCharAt = str.charAt(i11);
            if (cCharAt == '\"') {
                sb2.append(cCharAt);
                z10 = !z10;
            } else if (z10) {
                sb2.append(cCharAt);
            } else if (Character.isWhitespace(cCharAt)) {
                if (sb2.length() > 0) {
                    arrayList.add(sb2.toString());
                    sb2.setLength(0);
                }
            } else if ("().,!><=|&+-*/%{}[]:".indexOf(cCharAt) >= 0) {
                if (sb2.length() > 0) {
                    arrayList.add(sb2.toString());
                    sb2.setLength(0);
                }
                if ((cCharAt == '!' || cCharAt == '=' || cCharAt == '>' || cCharAt == '<' || cCharAt == '+' || cCharAt == '-' || cCharAt == '*' || cCharAt == '/' || cCharAt == '%') && (i10 = i11 + 1) < length && str.charAt(i10) == '=') {
                    arrayList.add(cCharAt + "=");
                    i11 = i10;
                } else {
                    arrayList.add(String.valueOf(cCharAt));
                }
            } else {
                sb2.append(cCharAt);
            }
            i11++;
        }
        if (sb2.length() > 0) {
            arrayList.add(sb2.toString());
        }
        return arrayList;
    }

    private com.mbridge.msdk.config.component.common.express.node.d c(com.mbridge.msdk.config.component.common.express.node.d dVar, boolean z10) {
        if (!this.f154217b.get(this.f154218c).equals("(")) {
            return a(dVar, z10);
        }
        this.f154218c++;
        com.mbridge.msdk.config.component.common.express.node.d dVarB = b(dVar, true);
        int i10 = this.f154218c + 1;
        this.f154218c = i10;
        return i10 > this.f154217b.size() - 1 ? dVarB : b(dVarB, false);
    }

    public com.mbridge.msdk.config.component.common.express.node.d a(String str) {
        this.f154217b = b(str);
        this.f154218c = 0;
        return b(null, false);
    }

    private com.mbridge.msdk.config.component.common.express.node.d a(com.mbridge.msdk.config.component.common.express.node.d dVar, int i10, boolean z10) {
        String str;
        Integer num;
        com.mbridge.msdk.config.component.common.express.node.d cVar;
        com.mbridge.msdk.config.component.common.express.node.d dVarC = c(dVar, z10);
        while (this.f154218c < this.f154217b.size() && (num = this.f154216a.get((str = this.f154217b.get(this.f154218c)))) != null && num.intValue() >= i10) {
            int i11 = this.f154218c + 1;
            this.f154218c = i11;
            if (i11 > this.f154217b.size() - 1) {
                break;
            }
            com.mbridge.msdk.config.component.common.express.node.d dVarA = a(dVar, num.intValue() + 1, z10);
            if (str.matches("=|\\+=|-=|\\*=|/=|%=")) {
                cVar = new com.mbridge.msdk.config.component.common.express.node.b(str, dVarC, dVarA);
            } else {
                cVar = new com.mbridge.msdk.config.component.common.express.node.c(str, dVarC, dVarA);
            }
            dVarC = cVar;
        }
        return dVarC;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00f2, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ff, code lost:
    
        r14 = new com.mbridge.msdk.config.component.common.express.node.i(androidx.compose.runtime.changelist.j.a(r4, r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.mbridge.msdk.config.component.common.express.node.d a(com.mbridge.msdk.config.component.common.express.node.d r14, boolean r15) {
        /*
            Method dump skipped, instruction units count: 1395
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.config.component.common.express.a.a(com.mbridge.msdk.config.component.common.express.node.d, boolean):com.mbridge.msdk.config.component.common.express.node.d");
    }

    private com.mbridge.msdk.config.component.common.express.node.d b(com.mbridge.msdk.config.component.common.express.node.d dVar, boolean z10) {
        return a(dVar, 0, z10);
    }
}
