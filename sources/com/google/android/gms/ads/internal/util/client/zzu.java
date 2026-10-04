package com.google.android.gms.ads.internal.util.client;

import android.content.Context;
import android.net.TrafficStats;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzcaq;
import e.g0;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzu implements zze {
    private final Context zza;

    @Nullable
    private final String zzb;

    @Nullable
    private String zzc;

    public zzu(Context context, @Nullable String str) {
        this.zza = context;
        this.zzb = str;
    }

    private final URL zzd(String str) throws MalformedURLException {
        URL urlZze = null;
        try {
            urlZze = new URI(str).toURL();
        } catch (IllegalArgumentException e10) {
            e = e10;
            zzf(str, e);
        } catch (MalformedURLException e11) {
            e = e11;
            zzf(str, e);
        } catch (URISyntaxException e12) {
            zzf(str, e12);
            if (((Boolean) zzba.zzc().zzd(zzbjg.zzf)).booleanValue()) {
                urlZze = zze(str);
            }
        }
        if (urlZze != null) {
            return urlZze;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 47);
        sb2.append("Falling back to direct new URL(\"");
        sb2.append(str);
        sb2.append("\") constructor.");
        zzo.zzd(sb2.toString());
        return new URL(str);
    }

    @Nullable
    private final URL zze(String str) {
        URL url;
        URI uri;
        try {
            zzo.zzd("Attempting to parse components, encode, and reconstruct URI.");
            URL url2 = new URL(str);
            uri = new URI(url2.getProtocol(), url2.getUserInfo(), url2.getHost(), url2.getPort(), url2.getPath(), url2.getQuery(), url2.getRef());
            url = uri.toURL();
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException e10) {
            e = e10;
            url = null;
        }
        try {
            String string = uri.toString();
            StringBuilder sb2 = new StringBuilder(str.length() + 114 + string.length());
            sb2.append("Successfully constructed URL after component encoding via new URI(parts).toURL() for original: \"");
            sb2.append(str);
            sb2.append("\" -> encoded URI: ");
            sb2.append(string);
            zzo.zzd(sb2.toString());
            return url;
        } catch (IllegalArgumentException e11) {
            e = e11;
            zzf(str, e);
            return url;
        } catch (MalformedURLException e12) {
            e = e12;
            zzf(str, e);
            return url;
        } catch (URISyntaxException e13) {
            e = e13;
            zzf(str, e);
            return url;
        }
    }

    private final void zzf(String str, Throwable th) {
        String message = th.getMessage();
        StringBuilder sb2 = new StringBuilder(str.length() + 32 + String.valueOf(message).length());
        sb2.append("Error while parsing ping URL: ");
        sb2.append(str);
        sb2.append(". ");
        sb2.append(message);
        zzo.zzi(sb2.toString());
        zzcaq.zza(this.zza).zzi(th, "HttpUrlPinger.pingUrl", ((Integer) zzba.zzc().zzd(zzbjg.zzou)).intValue() / 100.0f);
    }

    @Override // com.google.android.gms.ads.internal.util.client.zze
    @g0
    public final zzt zza(String str) {
        return zzc(str, null);
    }

    @Nullable
    public final String zzb() {
        return this.zzc;
    }

    @g0
    public final zzt zzc(String str, @Nullable Map map) {
        zzt zztVar = zzt.PERMANENT_FAILURE;
        if (str != null) {
            if (!((Boolean) zzba.zzc().zzd(zzbjg.zzg)).booleanValue() || !str.isEmpty()) {
                if (!((Boolean) zzba.zzc().zzd(zzbjg.zzdn)).booleanValue() || !zzay.zze()) {
                    try {
                        try {
                            if (ClientLibraryUtils.isPackageSide()) {
                                TrafficStats.setThreadStatsTag(263);
                            }
                            StringBuilder sb2 = new StringBuilder(str.length() + 13);
                            sb2.append("Pinging URL: ");
                            sb2.append(str);
                            zzo.zzd(sb2.toString());
                            HttpURLConnection httpURLConnection = (HttpURLConnection) zzd(str).openConnection();
                            try {
                                zzay.zza();
                                String str2 = this.zzb;
                                httpURLConnection.setConnectTimeout(60000);
                                httpURLConnection.setInstanceFollowRedirects(true);
                                httpURLConnection.setReadTimeout(60000);
                                if (str2 != null) {
                                    httpURLConnection.setRequestProperty("User-Agent", str2);
                                }
                                httpURLConnection.setUseCaches(false);
                                if (map != null) {
                                    for (Map.Entry entry : map.entrySet()) {
                                        httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                                    }
                                }
                                zzl zzlVar = new zzl(null);
                                zzlVar.zza(httpURLConnection, null);
                                int responseCode = httpURLConnection.getResponseCode();
                                zzlVar.zzc(httpURLConnection, responseCode);
                                if (responseCode < 200 || responseCode >= 300) {
                                    StringBuilder sb3 = new StringBuilder(String.valueOf(responseCode).length() + 54 + str.length());
                                    sb3.append("Received non-success response code ");
                                    sb3.append(responseCode);
                                    sb3.append(" from pinging URL: ");
                                    sb3.append(str);
                                    zzo.zzi(sb3.toString());
                                    if (responseCode == 502) {
                                        zztVar = zzt.RETRIABLE_FAILURE;
                                    }
                                } else {
                                    if (((Boolean) zzba.zzc().zzd(zzbjg.zzje)).booleanValue()) {
                                        this.zzc = httpURLConnection.getHeaderField("X-Afma-Ad-Event-Value");
                                    }
                                    zztVar = zzt.SUCCESS;
                                }
                                httpURLConnection.disconnect();
                                if (!ClientLibraryUtils.isPackageSide()) {
                                    return zztVar;
                                }
                            } catch (Throwable th) {
                                httpURLConnection.disconnect();
                                throw th;
                            }
                        } catch (Throwable th2) {
                            if (ClientLibraryUtils.isPackageSide()) {
                                TrafficStats.clearThreadStatsTag();
                            }
                            throw th2;
                        }
                    } catch (IOException e10) {
                        e = e10;
                        String message = e.getMessage();
                        StringBuilder sb4 = new StringBuilder(str.length() + 27 + String.valueOf(message).length());
                        sb4.append("Error while pinging URL: ");
                        sb4.append(str);
                        sb4.append(". ");
                        sb4.append(message);
                        zzo.zzi(sb4.toString());
                        zztVar = zzt.RETRIABLE_FAILURE;
                        if (ClientLibraryUtils.isPackageSide()) {
                        }
                        return zztVar;
                    } catch (IndexOutOfBoundsException e11) {
                        e = e11;
                        zzf(str, e);
                        if (ClientLibraryUtils.isPackageSide()) {
                        }
                        return zztVar;
                    } catch (RuntimeException e12) {
                        e = e12;
                        String message2 = e.getMessage();
                        StringBuilder sb42 = new StringBuilder(str.length() + 27 + String.valueOf(message2).length());
                        sb42.append("Error while pinging URL: ");
                        sb42.append(str);
                        sb42.append(". ");
                        sb42.append(message2);
                        zzo.zzi(sb42.toString());
                        zztVar = zzt.RETRIABLE_FAILURE;
                        if (ClientLibraryUtils.isPackageSide()) {
                        }
                        return zztVar;
                    } catch (MalformedURLException e13) {
                        e = e13;
                        zzf(str, e);
                        if (ClientLibraryUtils.isPackageSide()) {
                        }
                        return zztVar;
                    }
                    TrafficStats.clearThreadStatsTag();
                    return zztVar;
                }
            }
        }
        return zztVar;
    }
}
