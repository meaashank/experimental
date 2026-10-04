package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdzt {
    public static final zzgxm zza;
    public static final zzgxm zzb;
    private final String zzc;
    private final zzdzs zzd;
    private final zzdzs zze;

    static {
        zzdzs zzdzsVar = zzdzs.PUBLIC_API_CALL;
        zzdzs zzdzsVar2 = zzdzs.PUBLIC_API_CALLBACK;
        zzdzt zzdztVar = new zzdzt("tqgt", zzdzsVar, zzdzsVar2);
        zzdzs zzdzsVar3 = zzdzs.DYNAMITE_ENTER;
        zzdzt zzdztVar2 = new zzdzt("l.dl", zzdzsVar, zzdzsVar3);
        zzdzs zzdzsVar4 = zzdzs.READ_FROM_DISK_START;
        zzdzt zzdztVar3 = new zzdzt("l.rccde", zzdzsVar3, zzdzsVar4);
        zzdzt zzdztVar4 = new zzdzt("l.rfd", zzdzsVar4, zzdzs.READ_FROM_DISK_END);
        zzdzs zzdzsVar5 = zzdzs.CLIENT_SIGNALS_START;
        zzdzt zzdztVar5 = new zzdzt("l.rcc", zzdzsVar3, zzdzsVar5);
        zzdzs zzdzsVar6 = zzdzs.CLIENT_SIGNALS_END;
        zzdzt zzdztVar6 = new zzdzt("l.cs", zzdzsVar5, zzdzsVar6);
        zzdzs zzdzsVar7 = zzdzs.SERVICE_CONNECTED;
        zzdzt zzdztVar7 = new zzdzt("l.cts", zzdzsVar6, zzdzsVar7);
        zzdzs zzdzsVar8 = zzdzs.GMS_SIGNALS_START;
        zzdzs zzdzsVar9 = zzdzs.GMS_SIGNALS_END;
        zzdzt zzdztVar8 = new zzdzt("l.gs", zzdzsVar8, zzdzsVar9);
        zzdzs zzdzsVar10 = zzdzs.GET_SIGNALS_SDKCORE_START;
        zzdzt zzdztVar9 = new zzdzt("l.jse", zzdzsVar9, zzdzsVar10);
        zzdzs zzdzsVar11 = zzdzs.GET_SIGNALS_SDKCORE_END;
        zzdzt zzdztVar10 = new zzdzt("l.gs-sdkcore", zzdzsVar10, zzdzsVar11);
        zzdzt zzdztVar11 = new zzdzt("l.gs-pp", zzdzsVar11, zzdzsVar2);
        zzdzs zzdzsVar12 = zzdzs.RENDERING_START;
        zzdzt zzdztVar12 = new zzdzt("l.render", zzdzsVar12, zzdzsVar2);
        zzdzs zzdzsVar13 = zzdzs.RENDERING_WEBVIEW_CREATION_START;
        zzdzt zzdztVar13 = new zzdzt("l.render.pre", zzdzsVar12, zzdzsVar13);
        zzdzs zzdzsVar14 = zzdzs.RENDERING_WEBVIEW_CREATION_END;
        zzdzt zzdztVar14 = new zzdzt("l.render.wvc", zzdzsVar13, zzdzsVar14);
        zzdzs zzdzsVar15 = zzdzs.RENDERING_AD_COMPONENT_CREATION_END;
        zzdzt zzdztVar15 = new zzdzt("l.render.acc", zzdzsVar14, zzdzsVar15);
        zzdzs zzdzsVar16 = zzdzs.RENDERING_CONFIGURE_WEBVIEW_START;
        zzdzs zzdzsVar17 = zzdzs.RENDERING_CONFIGURE_WEBVIEW_END;
        zzdzt zzdztVar16 = new zzdzt("l.render.cfg-wv", zzdzsVar16, zzdzsVar17);
        zzdzs zzdzsVar18 = zzdzs.RENDERING_WEBVIEW_LOAD_HTML_START;
        zzdzs zzdzsVar19 = zzdzs.RENDERING_WEBVIEW_LOAD_HTML_END;
        zza = zzgxm.zzo(zzdztVar, zzdztVar2, zzdztVar3, zzdztVar4, zzdztVar5, zzdztVar6, zzdztVar7, zzdztVar8, zzdztVar9, zzdztVar10, zzdztVar11, zzdztVar12, zzdztVar13, zzdztVar14, zzdztVar15, zzdztVar16, new zzdzt("l.render.wvlh", zzdzsVar18, zzdzsVar19), new zzdzt("l.render.post", zzdzsVar19, zzdzsVar2), new zzdzt("l.sodv", zzdzs.SIGNAL_ON_DISK_VALIDATION_START, zzdzs.SIGNAL_ON_DISK_VALIDATION_END), new zzdzt("l.sodck", zzdzs.SIGNAL_ON_DISK_CACHE_KEY_START, zzdzs.SIGNAL_ON_DISK_CACHE_KEY_END), new zzdzt("l.sodrar", zzdzs.SIGNAL_ON_DISK_READ_AND_REMOVE_START, zzdzs.SIGNAL_ON_DISK_READ_AND_REMOVE_END), new zzdzt("l.soddc", zzdzs.SIGNAL_ON_DISK_DECODE_START, zzdzs.SIGNAL_ON_DISK_DECODE_END));
        zzdzt zzdztVar17 = new zzdzt("l.al", zzdzsVar, zzdzsVar2);
        zzdzt zzdztVar18 = new zzdzt("l.al2", zzdzsVar3, zzdzsVar2);
        zzdzt zzdztVar19 = new zzdzt("l.dl", zzdzsVar, zzdzsVar3);
        zzdzt zzdztVar20 = new zzdzt("l.rcc", zzdzsVar3, zzdzsVar5);
        zzdzt zzdztVar21 = new zzdzt("l.cs", zzdzsVar5, zzdzsVar6);
        zzdzt zzdztVar22 = new zzdzt("l.cts", zzdzsVar6, zzdzsVar7);
        zzdzt zzdztVar23 = new zzdzt("l.gs", zzdzsVar8, zzdzsVar9);
        zzdzs zzdzsVar20 = zzdzs.GET_AD_DICTIONARY_SDKCORE_START;
        zzdzt zzdztVar24 = new zzdzt("l.jse", zzdzsVar9, zzdzsVar20);
        zzdzs zzdzsVar21 = zzdzs.GET_AD_DICTIONARY_SDKCORE_END;
        zzdzt zzdztVar25 = new zzdzt("l.gad-js", zzdzsVar20, zzdzsVar21);
        zzdzs zzdzsVar22 = zzdzs.HTTP_RESPONSE_READY;
        zzdzt zzdztVar26 = new zzdzt("l.http", zzdzsVar21, zzdzsVar22);
        zzdzs zzdzsVar23 = zzdzs.SCAR_PRELOADER_READY;
        zzdzt zzdztVar27 = new zzdzt("l.slas.pre", zzdzsVar, zzdzsVar23);
        zzdzs zzdzsVar24 = zzdzs.SCAR_PRELOADER_PROCESSING_DONE;
        zzdzt zzdztVar28 = new zzdzt("l.slas.prel.p", zzdzsVar23, zzdzsVar24);
        zzdzs zzdzsVar25 = zzdzs.NORMALIZATION_AD_RESPONSE_START;
        zzdzt zzdztVar29 = new zzdzt("l.jse-nml", zzdzsVar22, zzdzsVar25);
        zzdzt zzdztVar30 = new zzdzt("l.jse-nml", zzdzsVar24, zzdzsVar25);
        zzdzs zzdzsVar26 = zzdzs.NORMALIZATION_AD_RESPONSE_END;
        zzdzt zzdztVar31 = new zzdzt("l.nml-js", zzdzsVar25, zzdzsVar26);
        zzdzs zzdzsVar27 = zzdzs.BINDER_CALL_START;
        zzdzt zzdztVar32 = new zzdzt("l.nml-gmsg", zzdzsVar26, zzdzsVar27);
        zzdzs zzdzsVar28 = zzdzs.SERVER_RESPONSE_PARSE_START;
        zzdzt zzdztVar33 = new zzdzt("l.nml-gmsg.s2s", zzdzsVar26, zzdzsVar28);
        zzdzt zzdztVar34 = new zzdzt("l.binder", zzdzsVar27, zzdzsVar28);
        zzdzt zzdztVar35 = new zzdzt("l.sr", zzdzsVar28, zzdzsVar12);
        zzdzt zzdztVar36 = new zzdzt("l.render", zzdzsVar12, zzdzsVar2);
        zzdzt zzdztVar37 = new zzdzt("l.t2", zzdzs.RENDERING_ADSTRING_TYPE2_FETCH_START, zzdzs.RENDERING_ADSTRING_TYPE2_FETCH_END);
        zzdzs zzdzsVar29 = zzdzs.RENDERING_NATIVE_ADS_NATIVE_JS_WEBVIEW_START;
        zzdzs zzdzsVar30 = zzdzs.RENDERING_NATIVE_ADS_PREPROCESS_START;
        zzdzt zzdztVar38 = new zzdzt("l.render.na.js", zzdzsVar29, zzdzsVar30);
        zzdzt zzdztVar39 = new zzdzt("l.render.na.prep", zzdzsVar30, zzdzs.RENDERING_NATIVE_ADS_PREPROCESS_END);
        zzdzt zzdztVar40 = new zzdzt("l.render.na.lna", zzdzs.RENDERING_NATIVE_ASSETS_LOADING_START, zzdzs.RENDERING_NATIVE_ASSETS_LOADING_END);
        zzdzt zzdztVar41 = new zzdzt("l.render.wvc", zzdzsVar13, zzdzsVar14);
        zzdzt zzdztVar42 = new zzdzt("l.render.acc", zzdzsVar14, zzdzsVar15);
        zzdzt zzdztVar43 = new zzdzt("l.render.cfg-wv", zzdzsVar16, zzdzsVar17);
        zzdzt zzdztVar44 = new zzdzt("l.render.pre", zzdzsVar12, zzdzsVar13);
        zzdzt zzdztVar45 = new zzdzt("l.render.post", zzdzsVar19, zzdzsVar2);
        zzdzt zzdztVar46 = new zzdzt("l.render.na.post", zzdzsVar17, zzdzsVar2);
        zzdzt zzdztVar47 = new zzdzt("l.render.wvlh", zzdzsVar18, zzdzsVar19);
        zzdzt zzdztVar48 = new zzdzt("l.na.b", zzdzs.NATIVE_ASSETS_LOADING_BASIC_START, zzdzs.NATIVE_ASSETS_LOADING_BASIC_END);
        zzdzt zzdztVar49 = new zzdzt("l.na.im", zzdzs.NATIVE_ASSETS_LOADING_IMAGE_START, zzdzs.NATIVE_ASSETS_LOADING_IMAGE_END);
        zzdzt zzdztVar50 = new zzdzt("l.na.imc", zzdzs.NATIVE_ASSETS_LOADING_IMAGE_COMPOSITION_START, zzdzs.NATIVE_ASSETS_LOADING_IMAGE_COMPOSITION_END);
        zzdzt zzdztVar51 = new zzdzt("l.na.l", zzdzs.NATIVE_ASSETS_LOADING_LOGO_START, zzdzs.NATIVE_ASSETS_LOADING_LOGO_END);
        zzdzt zzdztVar52 = new zzdzt("l.na.ic", zzdzs.NATIVE_ASSETS_LOADING_ICON_START, zzdzs.NATIVE_ASSETS_LOADING_ICON_END);
        zzdzt zzdztVar53 = new zzdzt("l.na.a", zzdzs.NATIVE_ASSETS_LOADING_ATTRIBUTION_START, zzdzs.NATIVE_ASSETS_LOADING_ATTRIBUTION_END);
        zzdzs zzdzsVar31 = zzdzs.NATIVE_ASSETS_LOADING_VIDEO_START;
        zzdzs zzdzsVar32 = zzdzs.NATIVE_ASSETS_LOADING_VIDEO_END;
        zzb = zzgxm.zzo(zzdztVar17, zzdztVar18, zzdztVar19, zzdztVar20, zzdztVar21, zzdztVar22, zzdztVar23, zzdztVar24, zzdztVar25, zzdztVar26, zzdztVar27, zzdztVar28, zzdztVar29, zzdztVar30, zzdztVar31, zzdztVar32, zzdztVar33, zzdztVar34, zzdztVar35, zzdztVar36, zzdztVar37, zzdztVar38, zzdztVar39, zzdztVar40, zzdztVar41, zzdztVar42, zzdztVar43, zzdztVar44, zzdztVar45, zzdztVar46, zzdztVar47, zzdztVar48, zzdztVar49, zzdztVar50, zzdztVar51, zzdztVar52, zzdztVar53, new zzdzt("l.na.v", zzdzsVar31, zzdzsVar32), new zzdzt("l.na.vc", zzdzs.NATIVE_ASSETS_LOADING_VIDEO_COMPOSITION_START, zzdzsVar32), new zzdzt("l.na.m", zzdzs.NATIVE_ASSETS_LOADING_MEDIA_START, zzdzs.NATIVE_ASSETS_LOADING_MEDIA_END), new zzdzt("l.na.c", zzdzs.NATIVE_ASSETS_LOADING_CUSTOM_START, zzdzs.NATIVE_ASSETS_LOADING_CUSTOM_END), new zzdzt("l.na.o", zzdzs.NATIVE_ASSETS_LOADING_OMID_START, zzdzs.NATIVE_ASSETS_LOADING_OMID_END));
    }

    public zzdzt(String str, zzdzs zzdzsVar, zzdzs zzdzsVar2) {
        this.zzc = str;
        this.zzd = zzdzsVar;
        this.zze = zzdzsVar2;
    }

    public final String zza() {
        return this.zzc;
    }

    public final zzdzs zzb() {
        return this.zzd;
    }

    public final zzdzs zzc() {
        return this.zze;
    }
}
