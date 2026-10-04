package P0;

import android.net.Uri;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class e {
    @NonNull
    public static String a(@NonNull Uri uri) {
        String scheme = uri.getScheme();
        String schemeSpecificPart = uri.getSchemeSpecificPart();
        if (scheme != null) {
            if (scheme.equalsIgnoreCase("tel") || scheme.equalsIgnoreCase("sip") || scheme.equalsIgnoreCase("sms") || scheme.equalsIgnoreCase("smsto") || scheme.equalsIgnoreCase(c.f65535c) || scheme.equalsIgnoreCase("nfc")) {
                StringBuilder sb2 = new StringBuilder(64);
                sb2.append(scheme);
                sb2.append(':');
                if (schemeSpecificPart != null) {
                    for (int i10 = 0; i10 < schemeSpecificPart.length(); i10++) {
                        char cCharAt = schemeSpecificPart.charAt(i10);
                        if (cCharAt == '-' || cCharAt == '@' || cCharAt == '.') {
                            sb2.append(cCharAt);
                        } else {
                            sb2.append('x');
                        }
                    }
                }
                return sb2.toString();
            }
            if (scheme.equalsIgnoreCase("http") || scheme.equalsIgnoreCase("https") || scheme.equalsIgnoreCase("ftp") || scheme.equalsIgnoreCase("rtsp")) {
                StringBuilder sb3 = new StringBuilder("//");
                sb3.append(uri.getHost() != null ? uri.getHost() : "");
                schemeSpecificPart = android.support.v4.media.e.a(sb3, uri.getPort() != -1 ? com.prism.gaia.server.accounts.b.f166434b0 + uri.getPort() : "", "/...");
            }
        }
        StringBuilder sb4 = new StringBuilder(64);
        if (scheme != null) {
            sb4.append(scheme);
            sb4.append(':');
        }
        if (schemeSpecificPart != null) {
            sb4.append(schemeSpecificPart);
        }
        return sb4.toString();
    }
}
