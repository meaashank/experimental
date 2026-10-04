package com.bykv.vk.openvk.preload.geckox.statistic;

import android.accounts.NetworkErrorException;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.model.Common;
import com.bykv.vk.openvk.preload.geckox.net.Response;
import com.bykv.vk.openvk.preload.geckox.statistic.model.StatisticModel;
import com.bykv.vk.openvk.preload.geckox.utils.e;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class c {
    public static void a(com.bykv.vk.openvk.preload.geckox.b bVar, com.bykv.vk.openvk.preload.geckox.a.a aVar) {
        IStatisticMonitor iStatisticMonitorN = bVar.n();
        if (iStatisticMonitorN != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("params_for_special", "gecko");
                jSONObject.put("device_id", bVar.o());
                jSONObject.put("os", 0);
                jSONObject.put("app_version", bVar.m());
                jSONObject.put("api_version", "v3");
                jSONObject.put("aid", bVar.k());
                jSONObject.put("x_tt_logid", aVar.f140447e);
                jSONObject.put("http_status", aVar.f140449g);
                jSONObject.put("err_msg", aVar.f140446d);
                if (TextUtils.isEmpty(aVar.f140447e)) {
                    jSONObject.put("deployments_info", aVar.f140444b);
                    jSONObject.put("local_info", aVar.f140443a);
                    jSONObject.put("custom_info", aVar.f140445c);
                } else {
                    jSONObject.put("deployments_info", "");
                    jSONObject.put("local_info", "");
                    jSONObject.put("custom_info", "");
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(Build.VERSION.SDK_INT);
                jSONObject.put("os_version", sb2.toString());
                jSONObject.put("device_platform", "android");
                jSONObject.put("device_model", Build.MODEL);
                jSONObject.put(CampaignEx.KEY_ACTIVITY_PATH_AND_NAME, aVar.f140448f);
                iStatisticMonitorN.upload("geckosdk_query_pkgs", jSONObject);
            } catch (Throwable th) {
                GeckoLogger.w("gecko-debug-tag", "UploadStatistic.upload:", th);
            }
        }
    }

    private static List<StatisticModel.PackageStatisticModel.DownloadFailRecords> b(List<StatisticModel.PackageStatisticModel.DownloadFailRecords> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list;
    }

    private static Integer a(List<StatisticModel.PackageStatisticModel.DownloadFailRecords> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return Integer.valueOf(list.size());
    }

    private static void a(com.bykv.vk.openvk.preload.geckox.statistic.model.a aVar, List<StatisticModel.PackageStatisticModel> list) {
        if (aVar.f140591B && aVar.f140592C) {
            StatisticModel.PackageStatisticModel packageStatisticModel = new StatisticModel.PackageStatisticModel();
            list.add(packageStatisticModel);
            packageStatisticModel.statsType = 0;
            packageStatisticModel.accessKey = aVar.f140596a;
            packageStatisticModel.groupName = aVar.f140597b;
            packageStatisticModel.channel = aVar.f140598c;
            packageStatisticModel.f140588ac = aVar.f140611p;
            packageStatisticModel.f140589id = aVar.f140613r;
            packageStatisticModel.downloadRetryTimes = a(aVar.f140618w);
            packageStatisticModel.downloadUrl = aVar.f140617v;
            packageStatisticModel.downloadFailRecords = b(aVar.f140618w);
            packageStatisticModel.downloadDuration = Long.valueOf(aVar.f140620y - aVar.f140619x);
            if (aVar.f140593D) {
                StatisticModel.PackageStatisticModel packageStatisticModel2 = new StatisticModel.PackageStatisticModel();
                list.add(packageStatisticModel2);
                packageStatisticModel2.accessKey = aVar.f140596a;
                packageStatisticModel2.groupName = aVar.f140597b;
                packageStatisticModel2.statsType = 2;
                packageStatisticModel2.f140589id = aVar.f140613r;
                packageStatisticModel2.channel = aVar.f140598c;
                packageStatisticModel2.activeCheckDuration = Long.valueOf(aVar.f140621z - aVar.f140620y);
                packageStatisticModel2.applyDuration = Long.valueOf(aVar.f140590A - aVar.f140621z);
                return;
            }
            StatisticModel.PackageStatisticModel packageStatisticModel3 = new StatisticModel.PackageStatisticModel();
            list.add(packageStatisticModel3);
            packageStatisticModel3.statsType = 3;
            packageStatisticModel3.accessKey = aVar.f140596a;
            packageStatisticModel3.groupName = aVar.f140597b;
            packageStatisticModel3.errCode = "500";
            packageStatisticModel3.f140589id = aVar.f140613r;
            packageStatisticModel3.channel = aVar.f140598c;
            packageStatisticModel3.errMsg = aVar.f140595F;
            return;
        }
        StatisticModel.PackageStatisticModel packageStatisticModel4 = new StatisticModel.PackageStatisticModel();
        list.add(packageStatisticModel4);
        packageStatisticModel4.statsType = 1;
        packageStatisticModel4.accessKey = aVar.f140596a;
        packageStatisticModel4.groupName = aVar.f140597b;
        packageStatisticModel4.channel = aVar.f140598c;
        packageStatisticModel4.f140588ac = aVar.f140611p;
        packageStatisticModel4.f140589id = aVar.f140613r;
        packageStatisticModel4.downloadRetryTimes = a(aVar.f140618w);
        packageStatisticModel4.downloadUrl = aVar.f140617v;
        packageStatisticModel4.downloadFailRecords = b(aVar.f140618w);
        if (!aVar.f140591B) {
            packageStatisticModel4.errCode = "300";
            List<StatisticModel.PackageStatisticModel.DownloadFailRecords> list2 = aVar.f140618w;
            if (list2 == null || list2.isEmpty()) {
                return;
            }
            packageStatisticModel4.errMsg = aVar.f140618w.get(0).reason;
            return;
        }
        if (aVar.f140592C) {
            return;
        }
        packageStatisticModel4.errCode = "450";
        packageStatisticModel4.errMsg = aVar.f140594E;
    }

    public static void a(final com.bykv.vk.openvk.preload.geckox.b bVar, a aVar) {
        StatisticModel statisticModel;
        ArrayList arrayList = new ArrayList();
        for (com.bykv.vk.openvk.preload.geckox.statistic.model.a aVar2 : aVar.a()) {
            if (aVar2.f140599d != null || aVar2.f140601f != 0) {
                if (aVar2.f140603h && aVar2.f140604i) {
                    StatisticModel.PackageStatisticModel packageStatisticModel = new StatisticModel.PackageStatisticModel();
                    arrayList.add(packageStatisticModel);
                    packageStatisticModel.statsType = 100;
                    packageStatisticModel.groupName = aVar2.f140597b;
                    packageStatisticModel.accessKey = aVar2.f140596a;
                    packageStatisticModel.channel = aVar2.f140598c;
                    packageStatisticModel.f140588ac = aVar2.f140611p;
                    packageStatisticModel.f140589id = aVar2.f140613r;
                    packageStatisticModel.patchId = aVar2.f140612q;
                    packageStatisticModel.downloadRetryTimes = a(aVar2.f140600e);
                    packageStatisticModel.downloadUrl = aVar2.f140599d;
                    packageStatisticModel.downloadFailRecords = b(aVar2.f140600e);
                    packageStatisticModel.downloadDuration = Long.valueOf(aVar2.f140602g - aVar2.f140601f);
                    if (!aVar2.f140605j) {
                        StatisticModel.PackageStatisticModel packageStatisticModel2 = new StatisticModel.PackageStatisticModel();
                        arrayList.add(packageStatisticModel2);
                        packageStatisticModel2.statsType = 100;
                        packageStatisticModel2.channel = aVar2.f140598c;
                        packageStatisticModel2.errCode = "403";
                        packageStatisticModel2.errMsg = aVar2.f140615t;
                        packageStatisticModel2.f140588ac = aVar2.f140611p;
                        packageStatisticModel2.patchId = aVar2.f140612q;
                        packageStatisticModel2.f140589id = aVar2.f140613r;
                        packageStatisticModel2.downloadRetryTimes = a(aVar2.f140600e);
                        packageStatisticModel2.downloadUrl = aVar2.f140599d;
                        packageStatisticModel2.downloadFailRecords = b(aVar2.f140600e);
                    } else if (aVar2.f140606k) {
                        StatisticModel.PackageStatisticModel packageStatisticModel3 = new StatisticModel.PackageStatisticModel();
                        arrayList.add(packageStatisticModel3);
                        packageStatisticModel3.accessKey = aVar2.f140596a;
                        packageStatisticModel3.groupName = aVar2.f140597b;
                        packageStatisticModel3.statsType = 102;
                        packageStatisticModel3.patchId = aVar2.f140612q;
                        packageStatisticModel3.f140589id = aVar2.f140613r;
                        packageStatisticModel3.channel = aVar2.f140598c;
                        packageStatisticModel3.activeCheckDuration = Long.valueOf(aVar2.f140609n - aVar2.f140602g);
                        packageStatisticModel3.applyDuration = Long.valueOf(aVar2.f140610o - aVar2.f140609n);
                    } else {
                        StatisticModel.PackageStatisticModel packageStatisticModel4 = new StatisticModel.PackageStatisticModel();
                        arrayList.add(packageStatisticModel4);
                        packageStatisticModel4.accessKey = aVar2.f140596a;
                        packageStatisticModel4.groupName = aVar2.f140597b;
                        packageStatisticModel4.statsType = 103;
                        packageStatisticModel4.errCode = "501";
                        packageStatisticModel4.channel = aVar2.f140598c;
                        packageStatisticModel4.patchId = aVar2.f140612q;
                        packageStatisticModel4.f140589id = aVar2.f140613r;
                        packageStatisticModel4.errMsg = aVar2.f140616u;
                        a(aVar2, arrayList);
                    }
                } else {
                    StatisticModel.PackageStatisticModel packageStatisticModel5 = new StatisticModel.PackageStatisticModel();
                    arrayList.add(packageStatisticModel5);
                    packageStatisticModel5.statsType = 101;
                    packageStatisticModel5.accessKey = aVar2.f140596a;
                    packageStatisticModel5.groupName = aVar2.f140597b;
                    packageStatisticModel5.channel = aVar2.f140598c;
                    packageStatisticModel5.f140588ac = aVar2.f140611p;
                    packageStatisticModel5.patchId = aVar2.f140612q;
                    packageStatisticModel5.f140589id = aVar2.f140613r;
                    packageStatisticModel5.downloadRetryTimes = a(aVar2.f140600e);
                    packageStatisticModel5.downloadUrl = aVar2.f140599d;
                    packageStatisticModel5.downloadFailRecords = b(aVar2.f140600e);
                    if (!aVar2.f140603h) {
                        packageStatisticModel5.errCode = "301";
                        List<StatisticModel.PackageStatisticModel.DownloadFailRecords> list = aVar2.f140600e;
                        if (list != null && !list.isEmpty()) {
                            packageStatisticModel5.errMsg = aVar2.f140600e.get(0).reason;
                        }
                    } else if (!aVar2.f140604i) {
                        packageStatisticModel5.errCode = "402";
                        packageStatisticModel5.errMsg = aVar2.f140614s;
                    }
                    a(aVar2, arrayList);
                }
            }
            a(aVar2, arrayList);
        }
        Context contextA = bVar.a();
        arrayList.addAll(com.bykv.vk.openvk.preload.geckox.a.a.a(contextA));
        if (arrayList.isEmpty()) {
            statisticModel = null;
        } else {
            Common common = new Common(bVar.k(), bVar.m(), bVar.o(), com.bykv.vk.openvk.preload.geckox.utils.a.b(contextA), e.a(contextA), null, null);
            statisticModel = new StatisticModel();
            statisticModel.common = common;
            statisticModel.packages = arrayList;
            String string = UUID.randomUUID().toString();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((StatisticModel.PackageStatisticModel) obj).logId = string;
            }
        }
        StatisticModel statisticModel2 = statisticModel;
        if (statisticModel2 == null || statisticModel2.packages == null) {
            return;
        }
        IStatisticMonitor iStatisticMonitorN = bVar.n();
        if (iStatisticMonitorN != null) {
            try {
                for (StatisticModel.PackageStatisticModel packageStatisticModel6 : statisticModel2.packages) {
                    Common common2 = statisticModel2.common;
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("params_for_special", "gecko");
                    jSONObject.put("region", common2.region);
                    jSONObject.put("err_code", packageStatisticModel6.errCode);
                    jSONObject.put("err_msg", packageStatisticModel6.errMsg);
                    jSONObject.put("sdk_version", common2.sdkVersion);
                    jSONObject.put("access_key", packageStatisticModel6.accessKey);
                    jSONObject.put("stats_type", packageStatisticModel6.statsType);
                    jSONObject.put("device_id", common2.deviceId);
                    Long l10 = packageStatisticModel6.patchId;
                    jSONObject.put("patch_id", l10 == null ? 0L : l10.longValue());
                    jSONObject.put("group_name", packageStatisticModel6.groupName);
                    jSONObject.put("os", common2.os);
                    jSONObject.put("app_version", common2.appVersion);
                    jSONObject.put("device_model", common2.deviceModel);
                    jSONObject.put("channel", packageStatisticModel6.channel);
                    Long l11 = packageStatisticModel6.f140589id;
                    jSONObject.put("id", l11 == null ? 0L : l11.longValue());
                    jSONObject.put(CampaignEx.KEY_ACTIVITY_PATH_AND_NAME, common2.f140578ac);
                    Integer num = packageStatisticModel6.downloadRetryTimes;
                    jSONObject.put("download_retry_times", num == null ? 0 : num.intValue());
                    String str = packageStatisticModel6.downloadUrl;
                    Object obj2 = "";
                    if (str == null) {
                        str = "";
                    }
                    jSONObject.put(DownloadModel.DOWNLOAD_URL, str);
                    jSONObject.put("download_duration", packageStatisticModel6.downloadDuration);
                    List<StatisticModel.PackageStatisticModel.DownloadFailRecords> list2 = packageStatisticModel6.downloadFailRecords;
                    if (list2 != null) {
                        obj2 = list2;
                    }
                    jSONObject.put("download_fail_records", obj2);
                    jSONObject.put("log_id", packageStatisticModel6.logId);
                    Long l12 = packageStatisticModel6.activeCheckDuration;
                    jSONObject.put("active_check_duration", l12 == null ? 0L : l12.longValue());
                    Long l13 = packageStatisticModel6.applyDuration;
                    jSONObject.put("apply_duration", l13 == null ? 0L : l13.longValue());
                    iStatisticMonitorN.upload("geckosdk_update_stats", jSONObject);
                }
            } catch (Throwable th) {
                GeckoLogger.w("gecko-debug-tag", "UploadStatistic.upload:", th);
            }
        }
        if (bVar.c()) {
            try {
                final String strA = com.bykv.vk.openvk.preload.geckox.c.b.a().b().a(statisticModel2);
                if (TextUtils.isEmpty(strA)) {
                    return;
                }
                final String str2 = R3.a.f67726d + bVar.j() + "/gecko/server/packages/stats";
                com.bykv.vk.openvk.preload.geckox.b.g().execute(new Runnable() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.c.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        for (int i11 = 0; i11 < 3; i11++) {
                            try {
                                Response responseDoPost = bVar.i().doPost(str2, strA);
                                if (responseDoPost.code != 200) {
                                    throw new NetworkErrorException("net work get failed, code: " + responseDoPost.code + ", url:" + str2);
                                }
                                if (new JSONObject(responseDoPost.body).getInt("status") == 0) {
                                    return;
                                }
                            } catch (Exception e10) {
                                GeckoLogger.w("gecko-debug-tag", "upload statistic:", e10);
                            }
                        }
                    }
                });
            } catch (Throwable unused) {
            }
        }
    }
}
