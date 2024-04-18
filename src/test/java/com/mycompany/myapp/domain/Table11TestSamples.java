package com.mycompany.myapp.domain;

import java.util.Random;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class Table11TestSamples {

    private static final Random random = new Random();
    private static final AtomicLong longCount = new AtomicLong(random.nextInt() + (2 * Integer.MAX_VALUE));
    private static final AtomicInteger intCount = new AtomicInteger(random.nextInt() + (2 * Short.MAX_VALUE));

    public static Table11 getTable11Sample1() {
        return new Table11()
            .id(1L)
            .numLigne1(1)
            .resort2("resort21")
            .resvNameId3(1)
            .clientOId4("clientOId41")
            .typeChb5("typeChb51")
            .confirmationNo6("confirmationNo61")
            .clientMdmId7("clientMdmId71")
            .nameId8(1)
            .parentResvNameId9(1)
            .contactId10(1)
            .agenceId11(1)
            .agenceNom12("agenceNom121")
            .societeId13(1)
            .groupeId14(1)
            .numBloc15(1)
            .typeResv16("typeResv161")
            .statutResv17("statutResv171")
            .pseudoRoomYn23("pseudoRoomYn231")
            .createurResv24(1)
            .nomCreateurResv25("nomCreateurResv251")
            .codeGarantie26("codeGarantie261")
            .flgDed27("flgDed271")
            .codePays28("codePays281")
            .libPays29("libPays291")
            .codeNationalite30("codeNationalite301")
            .libNationalite31("libNationalite311")
            .codeSource32("codeSource321")
            .libSource33("libSource331")
            .codeGrandSource34("codeGrandSource341")
            .codeOrigine35("codeOrigine351")
            .libOrigine36("libOrigine361")
            .codeMarche37("codeMarche371")
            .libMarche38("libMarche381")
            .codeGrandMarche39("codeGrandMarche391")
            .libGrandMarche40("libGrandMarche401")
            .codePrix41("codePrix411")
            .categPrix42("categPrix421")
            .libPrix43("libPrix431")
            .numChb44("numChb441")
            .descriptionTypeChb45("descriptionTypeChb451")
            .codeTypeChb46("codeTypeChb461")
            .classChb47("classChb471")
            .caractChb48("caractChb481")
            .typeChbDeReservation49("typeChbDeReservation491")
            .descriptionTypeChbDeResv50("descriptionTypeChbDeResv501")
            .codeTypeChbDeResv51("codeTypeChbDeResv511")
            .statutDeReservation52("statutDeReservation521")
            .circuitDistribution53("circuitDistribution531")
            .circuitDistribUserRegroup54("circuitDistribUserRegroup541")
            .numCrs55("numCrs551")
            .typeRefCrs56("typeRefCrs561")
            .statutPremier60("statutPremier601")
            .statutDernier62("statutDernier621")
            .statutDernierPseudo64("statutDernierPseudo641")
            .diffDtCreaAnn65(1)
            .diffDtArrAnn66(1)
            .leadtime67(1)
            .los68(1)
            .occupantsGroupe69("occupantsGroupe691")
            .nbNuitee70(1)
            .nbNuiteeNnDed71(1)
            .nbResvAnn72(1)
            .nbAdu73(1)
            .nbEnf74(1)
            .nbPersDayU75(1)
            .nbPersArr76(1)
            .nbPersDep77(1)
            .nbPersAnn78(1)
            .nbPersNoshow79(1)
            .nbChbDayU80(1)
            .nbChbArr81(1)
            .nbChbDep82(1)
            .nbChbAnn83(1)
            .nbChbNoshow84(1)
            .revenuNetChambre85(1L)
            .revenuTaxeChambre86(1L)
            .revenuNetChambreGlobal87(1L)
            .revenuTaxeChambreGlobal88(1L)
            .revenuNetBq89(1L)
            .revenuTaxeBq90(1L)
            .revenuNetBqGlobal91(1L)
            .revenuTaxeBqGlobal92(1L)
            .revenuNetExtra93(1L)
            .revenuTaxeExtra94(1L)
            .revenuNetExtraGlobal95(1L)
            .revenuTaxeExtraGlobal96(1L)
            .revenuNetTotal97(1L)
            .revenuTaxeTotal98(1L)
            .revenuNetTotalGlobal99(1L)
            .revenuTaxeTotalGlobal100(1L)
            .prodRevenuChambre101(1L)
            .prodRevenuBq102(1L)
            .prodRevenuExtra103(1L)
            .prodRevenuTotal104(1L)
            .prodChambreNbNuitees105(1L)
            .numLigne108(1)
            .resort109("resort1091")
            .resvNameId110(1)
            .clientOId111("clientOId1111")
            .typeChb112("typeChb1121")
            .confirmationNo113("confirmationNo1131")
            .clientMdmId114("clientMdmId1141")
            .nameId115(1)
            .parentResvNameId116(1)
            .contactId117(1)
            .agenceId118(1)
            .agenceNom119("agenceNom1191")
            .societeId120(1)
            .groupeId121(1)
            .numBloc122(1)
            .typeResv123("typeResv1231")
            .statutResv124("statutResv1241")
            .pseudoRoomYn130("pseudoRoomYn1301")
            .createurResv131(1)
            .nomCreateurResv132("nomCreateurResv1321")
            .codeGarantie133("codeGarantie1331")
            .flgDed134("flgDed1341")
            .codePays135("codePays1351")
            .libPays136("libPays1361")
            .codeNationalite137("codeNationalite1371")
            .libNationalite138("libNationalite1381")
            .codeSource139("codeSource1391")
            .libSource140("libSource1401")
            .codeGrandSource141("codeGrandSource1411")
            .codeOrigine142("codeOrigine1421")
            .libOrigine143("libOrigine1431")
            .codeMarche144("codeMarche1441")
            .libMarche145("libMarche1451")
            .codeGrandMarche146("codeGrandMarche1461")
            .libGrandMarche147("libGrandMarche1471")
            .codePrix148("codePrix1481")
            .categPrix149("categPrix1491")
            .libPrix150("libPrix1501")
            .numChb151("numChb1511")
            .descriptionTypeChb152("descriptionTypeChb1521")
            .codeTypeChb153("codeTypeChb1531")
            .classChb154("classChb1541")
            .caractChb155("caractChb1551")
            .typeChbDeReservation156("typeChbDeReservation1561")
            .descriptionTypeChbDeResv157("descriptionTypeChbDeResv1571")
            .codeTypeChbDeResv158("codeTypeChbDeResv1581")
            .statutDeReservation159("statutDeReservation1591")
            .circuitDistribution160("circuitDistribution1601")
            .circuitDistribUserRegroup161("circuitDistribUserRegroup1611")
            .numCrs162("numCrs1621")
            .typeRefCrs163("typeRefCrs1631")
            .statutPremier167("statutPremier1671")
            .statutDernier169("statutDernier1691")
            .statutDernierPseudo171("statutDernierPseudo1711")
            .diffDtCreaAnn172(1)
            .diffDtArrAnn173(1)
            .leadtime174(1)
            .los175(1)
            .occupantsGroupe176("occupantsGroupe1761")
            .nbNuitee177(1)
            .nbNuiteeNnDed178(1)
            .nbResvAnn179(1)
            .nbAdu180(1)
            .nbEnf181(1)
            .nbPersDayU182(1)
            .nbPersArr183(1)
            .nbPersDep184(1)
            .nbPersAnn185(1)
            .nbPersNoshow186(1)
            .nbChbDayU187(1)
            .nbChbArr188(1)
            .nbChbDep189(1)
            .nbChbAnn190(1)
            .nbChbNoshow191(1)
            .revenuNetChambre192(1L)
            .revenuTaxeChambre193(1L)
            .revenuNetChambreGlobal194(1L)
            .revenuTaxeChambreGlobal195(1L)
            .revenuNetBq196(1L)
            .revenuTaxeBq197(1L)
            .revenuNetBqGlobal198(1L)
            .revenuTaxeBqGlobal199(1L)
            .revenuNetExtra200(1L)
            .revenuTaxeExtra201(1L)
            .revenuNetExtraGlobal202(1L)
            .revenuTaxeExtraGlobal203(1L)
            .revenuNetTotal204(1L)
            .revenuTaxeTotal205(1L)
            .revenuNetTotalGlobal206(1L)
            .revenuTaxeTotalGlobal207(1L)
            .prodRevenuChambre208(1L)
            .prodRevenuBq209(1L)
            .prodRevenuExtra210(1L)
            .prodRevenuTotal211(1L)
            .prodChambreNbNuitees212(1L)
            .numLigne215(1)
            .resort216("resort2161")
            .resvNameId217(1)
            .clientOId218("clientOId2181")
            .typeChb219("typeChb2191")
            .confirmationNo220("confirmationNo2201")
            .clientMdmId221("clientMdmId2211")
            .nameId222(1)
            .parentResvNameId223(1)
            .contactId224(1)
            .agenceId225(1)
            .agenceNom226("agenceNom2261")
            .societeId227(1)
            .groupeId228(1)
            .numBloc229(1)
            .typeResv230("typeResv2301")
            .statutResv231("statutResv2311")
            .pseudoRoomYn237("pseudoRoomYn2371")
            .createurResv238(1)
            .nomCreateurResv239("nomCreateurResv2391")
            .codeGarantie240("codeGarantie2401")
            .flgDed241("flgDed2411")
            .codePays242("codePays2421")
            .libPays243("libPays2431")
            .codeNationalite244("codeNationalite2441")
            .libNationalite245("libNationalite2451")
            .codeSource246("codeSource2461")
            .libSource247("libSource2471")
            .codeGrandSource248("codeGrandSource2481")
            .codeOrigine249("codeOrigine2491")
            .libOrigine250("libOrigine2501")
            .codeMarche251("codeMarche2511")
            .libMarche252("libMarche2521")
            .codeGrandMarche253("codeGrandMarche2531")
            .libGrandMarche254("libGrandMarche2541")
            .codePrix255("codePrix2551")
            .categPrix256("categPrix2561")
            .libPrix257("libPrix2571")
            .numChb258("numChb2581")
            .descriptionTypeChb259("descriptionTypeChb2591")
            .codeTypeChb260("codeTypeChb2601")
            .classChb261("classChb2611")
            .caractChb262("caractChb2621")
            .typeChbDeReservation263("typeChbDeReservation2631")
            .descriptionTypeChbDeResv264("descriptionTypeChbDeResv2641")
            .codeTypeChbDeResv265("codeTypeChbDeResv2651")
            .statutDeReservation266("statutDeReservation2661")
            .circuitDistribution267("circuitDistribution2671")
            .circuitDistribUserRegroup268("circuitDistribUserRegroup2681")
            .numCrs269("numCrs2691")
            .typeRefCrs270("typeRefCrs2701")
            .statutPremier274("statutPremier2741")
            .statutDernier276("statutDernier2761")
            .statutDernierPseudo278("statutDernierPseudo2781")
            .diffDtCreaAnn279(1)
            .diffDtArrAnn280(1)
            .leadtime281(1)
            .los282(1)
            .occupantsGroupe283("occupantsGroupe2831")
            .nbNuitee284(1)
            .nbNuiteeNnDed285(1)
            .nbResvAnn286(1)
            .nbAdu287(1)
            .nbEnf288(1)
            .nbPersDayU289(1)
            .nbPersArr290(1)
            .nbPersDep291(1)
            .nbPersAnn292(1)
            .nbPersNoshow293(1)
            .nbChbDayU294(1)
            .nbChbArr295(1)
            .nbChbDep296(1)
            .nbChbAnn297(1)
            .nbChbNoshow298(1)
            .revenuNetChambre299(1L)
            .revenuTaxeChambre300(1L)
            .revenuNetChambreGlobal301(1L)
            .revenuTaxeChambreGlobal302(1L)
            .revenuNetBq303(1L)
            .revenuTaxeBq304(1L)
            .revenuNetBqGlobal305(1L)
            .revenuTaxeBqGlobal306(1L)
            .revenuNetExtra307(1L)
            .revenuTaxeExtra308(1L)
            .revenuNetExtraGlobal309(1L)
            .revenuTaxeExtraGlobal310(1L);
    }

    public static Table11 getTable11Sample2() {
        return new Table11()
            .id(2L)
            .numLigne1(2)
            .resort2("resort22")
            .resvNameId3(2)
            .clientOId4("clientOId42")
            .typeChb5("typeChb52")
            .confirmationNo6("confirmationNo62")
            .clientMdmId7("clientMdmId72")
            .nameId8(2)
            .parentResvNameId9(2)
            .contactId10(2)
            .agenceId11(2)
            .agenceNom12("agenceNom122")
            .societeId13(2)
            .groupeId14(2)
            .numBloc15(2)
            .typeResv16("typeResv162")
            .statutResv17("statutResv172")
            .pseudoRoomYn23("pseudoRoomYn232")
            .createurResv24(2)
            .nomCreateurResv25("nomCreateurResv252")
            .codeGarantie26("codeGarantie262")
            .flgDed27("flgDed272")
            .codePays28("codePays282")
            .libPays29("libPays292")
            .codeNationalite30("codeNationalite302")
            .libNationalite31("libNationalite312")
            .codeSource32("codeSource322")
            .libSource33("libSource332")
            .codeGrandSource34("codeGrandSource342")
            .codeOrigine35("codeOrigine352")
            .libOrigine36("libOrigine362")
            .codeMarche37("codeMarche372")
            .libMarche38("libMarche382")
            .codeGrandMarche39("codeGrandMarche392")
            .libGrandMarche40("libGrandMarche402")
            .codePrix41("codePrix412")
            .categPrix42("categPrix422")
            .libPrix43("libPrix432")
            .numChb44("numChb442")
            .descriptionTypeChb45("descriptionTypeChb452")
            .codeTypeChb46("codeTypeChb462")
            .classChb47("classChb472")
            .caractChb48("caractChb482")
            .typeChbDeReservation49("typeChbDeReservation492")
            .descriptionTypeChbDeResv50("descriptionTypeChbDeResv502")
            .codeTypeChbDeResv51("codeTypeChbDeResv512")
            .statutDeReservation52("statutDeReservation522")
            .circuitDistribution53("circuitDistribution532")
            .circuitDistribUserRegroup54("circuitDistribUserRegroup542")
            .numCrs55("numCrs552")
            .typeRefCrs56("typeRefCrs562")
            .statutPremier60("statutPremier602")
            .statutDernier62("statutDernier622")
            .statutDernierPseudo64("statutDernierPseudo642")
            .diffDtCreaAnn65(2)
            .diffDtArrAnn66(2)
            .leadtime67(2)
            .los68(2)
            .occupantsGroupe69("occupantsGroupe692")
            .nbNuitee70(2)
            .nbNuiteeNnDed71(2)
            .nbResvAnn72(2)
            .nbAdu73(2)
            .nbEnf74(2)
            .nbPersDayU75(2)
            .nbPersArr76(2)
            .nbPersDep77(2)
            .nbPersAnn78(2)
            .nbPersNoshow79(2)
            .nbChbDayU80(2)
            .nbChbArr81(2)
            .nbChbDep82(2)
            .nbChbAnn83(2)
            .nbChbNoshow84(2)
            .revenuNetChambre85(2L)
            .revenuTaxeChambre86(2L)
            .revenuNetChambreGlobal87(2L)
            .revenuTaxeChambreGlobal88(2L)
            .revenuNetBq89(2L)
            .revenuTaxeBq90(2L)
            .revenuNetBqGlobal91(2L)
            .revenuTaxeBqGlobal92(2L)
            .revenuNetExtra93(2L)
            .revenuTaxeExtra94(2L)
            .revenuNetExtraGlobal95(2L)
            .revenuTaxeExtraGlobal96(2L)
            .revenuNetTotal97(2L)
            .revenuTaxeTotal98(2L)
            .revenuNetTotalGlobal99(2L)
            .revenuTaxeTotalGlobal100(2L)
            .prodRevenuChambre101(2L)
            .prodRevenuBq102(2L)
            .prodRevenuExtra103(2L)
            .prodRevenuTotal104(2L)
            .prodChambreNbNuitees105(2L)
            .numLigne108(2)
            .resort109("resort1092")
            .resvNameId110(2)
            .clientOId111("clientOId1112")
            .typeChb112("typeChb1122")
            .confirmationNo113("confirmationNo1132")
            .clientMdmId114("clientMdmId1142")
            .nameId115(2)
            .parentResvNameId116(2)
            .contactId117(2)
            .agenceId118(2)
            .agenceNom119("agenceNom1192")
            .societeId120(2)
            .groupeId121(2)
            .numBloc122(2)
            .typeResv123("typeResv1232")
            .statutResv124("statutResv1242")
            .pseudoRoomYn130("pseudoRoomYn1302")
            .createurResv131(2)
            .nomCreateurResv132("nomCreateurResv1322")
            .codeGarantie133("codeGarantie1332")
            .flgDed134("flgDed1342")
            .codePays135("codePays1352")
            .libPays136("libPays1362")
            .codeNationalite137("codeNationalite1372")
            .libNationalite138("libNationalite1382")
            .codeSource139("codeSource1392")
            .libSource140("libSource1402")
            .codeGrandSource141("codeGrandSource1412")
            .codeOrigine142("codeOrigine1422")
            .libOrigine143("libOrigine1432")
            .codeMarche144("codeMarche1442")
            .libMarche145("libMarche1452")
            .codeGrandMarche146("codeGrandMarche1462")
            .libGrandMarche147("libGrandMarche1472")
            .codePrix148("codePrix1482")
            .categPrix149("categPrix1492")
            .libPrix150("libPrix1502")
            .numChb151("numChb1512")
            .descriptionTypeChb152("descriptionTypeChb1522")
            .codeTypeChb153("codeTypeChb1532")
            .classChb154("classChb1542")
            .caractChb155("caractChb1552")
            .typeChbDeReservation156("typeChbDeReservation1562")
            .descriptionTypeChbDeResv157("descriptionTypeChbDeResv1572")
            .codeTypeChbDeResv158("codeTypeChbDeResv1582")
            .statutDeReservation159("statutDeReservation1592")
            .circuitDistribution160("circuitDistribution1602")
            .circuitDistribUserRegroup161("circuitDistribUserRegroup1612")
            .numCrs162("numCrs1622")
            .typeRefCrs163("typeRefCrs1632")
            .statutPremier167("statutPremier1672")
            .statutDernier169("statutDernier1692")
            .statutDernierPseudo171("statutDernierPseudo1712")
            .diffDtCreaAnn172(2)
            .diffDtArrAnn173(2)
            .leadtime174(2)
            .los175(2)
            .occupantsGroupe176("occupantsGroupe1762")
            .nbNuitee177(2)
            .nbNuiteeNnDed178(2)
            .nbResvAnn179(2)
            .nbAdu180(2)
            .nbEnf181(2)
            .nbPersDayU182(2)
            .nbPersArr183(2)
            .nbPersDep184(2)
            .nbPersAnn185(2)
            .nbPersNoshow186(2)
            .nbChbDayU187(2)
            .nbChbArr188(2)
            .nbChbDep189(2)
            .nbChbAnn190(2)
            .nbChbNoshow191(2)
            .revenuNetChambre192(2L)
            .revenuTaxeChambre193(2L)
            .revenuNetChambreGlobal194(2L)
            .revenuTaxeChambreGlobal195(2L)
            .revenuNetBq196(2L)
            .revenuTaxeBq197(2L)
            .revenuNetBqGlobal198(2L)
            .revenuTaxeBqGlobal199(2L)
            .revenuNetExtra200(2L)
            .revenuTaxeExtra201(2L)
            .revenuNetExtraGlobal202(2L)
            .revenuTaxeExtraGlobal203(2L)
            .revenuNetTotal204(2L)
            .revenuTaxeTotal205(2L)
            .revenuNetTotalGlobal206(2L)
            .revenuTaxeTotalGlobal207(2L)
            .prodRevenuChambre208(2L)
            .prodRevenuBq209(2L)
            .prodRevenuExtra210(2L)
            .prodRevenuTotal211(2L)
            .prodChambreNbNuitees212(2L)
            .numLigne215(2)
            .resort216("resort2162")
            .resvNameId217(2)
            .clientOId218("clientOId2182")
            .typeChb219("typeChb2192")
            .confirmationNo220("confirmationNo2202")
            .clientMdmId221("clientMdmId2212")
            .nameId222(2)
            .parentResvNameId223(2)
            .contactId224(2)
            .agenceId225(2)
            .agenceNom226("agenceNom2262")
            .societeId227(2)
            .groupeId228(2)
            .numBloc229(2)
            .typeResv230("typeResv2302")
            .statutResv231("statutResv2312")
            .pseudoRoomYn237("pseudoRoomYn2372")
            .createurResv238(2)
            .nomCreateurResv239("nomCreateurResv2392")
            .codeGarantie240("codeGarantie2402")
            .flgDed241("flgDed2412")
            .codePays242("codePays2422")
            .libPays243("libPays2432")
            .codeNationalite244("codeNationalite2442")
            .libNationalite245("libNationalite2452")
            .codeSource246("codeSource2462")
            .libSource247("libSource2472")
            .codeGrandSource248("codeGrandSource2482")
            .codeOrigine249("codeOrigine2492")
            .libOrigine250("libOrigine2502")
            .codeMarche251("codeMarche2512")
            .libMarche252("libMarche2522")
            .codeGrandMarche253("codeGrandMarche2532")
            .libGrandMarche254("libGrandMarche2542")
            .codePrix255("codePrix2552")
            .categPrix256("categPrix2562")
            .libPrix257("libPrix2572")
            .numChb258("numChb2582")
            .descriptionTypeChb259("descriptionTypeChb2592")
            .codeTypeChb260("codeTypeChb2602")
            .classChb261("classChb2612")
            .caractChb262("caractChb2622")
            .typeChbDeReservation263("typeChbDeReservation2632")
            .descriptionTypeChbDeResv264("descriptionTypeChbDeResv2642")
            .codeTypeChbDeResv265("codeTypeChbDeResv2652")
            .statutDeReservation266("statutDeReservation2662")
            .circuitDistribution267("circuitDistribution2672")
            .circuitDistribUserRegroup268("circuitDistribUserRegroup2682")
            .numCrs269("numCrs2692")
            .typeRefCrs270("typeRefCrs2702")
            .statutPremier274("statutPremier2742")
            .statutDernier276("statutDernier2762")
            .statutDernierPseudo278("statutDernierPseudo2782")
            .diffDtCreaAnn279(2)
            .diffDtArrAnn280(2)
            .leadtime281(2)
            .los282(2)
            .occupantsGroupe283("occupantsGroupe2832")
            .nbNuitee284(2)
            .nbNuiteeNnDed285(2)
            .nbResvAnn286(2)
            .nbAdu287(2)
            .nbEnf288(2)
            .nbPersDayU289(2)
            .nbPersArr290(2)
            .nbPersDep291(2)
            .nbPersAnn292(2)
            .nbPersNoshow293(2)
            .nbChbDayU294(2)
            .nbChbArr295(2)
            .nbChbDep296(2)
            .nbChbAnn297(2)
            .nbChbNoshow298(2)
            .revenuNetChambre299(2L)
            .revenuTaxeChambre300(2L)
            .revenuNetChambreGlobal301(2L)
            .revenuTaxeChambreGlobal302(2L)
            .revenuNetBq303(2L)
            .revenuTaxeBq304(2L)
            .revenuNetBqGlobal305(2L)
            .revenuTaxeBqGlobal306(2L)
            .revenuNetExtra307(2L)
            .revenuTaxeExtra308(2L)
            .revenuNetExtraGlobal309(2L)
            .revenuTaxeExtraGlobal310(2L);
    }

    public static Table11 getTable11RandomSampleGenerator() {
        return new Table11()
            .id(longCount.incrementAndGet())
            .numLigne1(intCount.incrementAndGet())
            .resort2(UUID.randomUUID().toString())
            .resvNameId3(intCount.incrementAndGet())
            .clientOId4(UUID.randomUUID().toString())
            .typeChb5(UUID.randomUUID().toString())
            .confirmationNo6(UUID.randomUUID().toString())
            .clientMdmId7(UUID.randomUUID().toString())
            .nameId8(intCount.incrementAndGet())
            .parentResvNameId9(intCount.incrementAndGet())
            .contactId10(intCount.incrementAndGet())
            .agenceId11(intCount.incrementAndGet())
            .agenceNom12(UUID.randomUUID().toString())
            .societeId13(intCount.incrementAndGet())
            .groupeId14(intCount.incrementAndGet())
            .numBloc15(intCount.incrementAndGet())
            .typeResv16(UUID.randomUUID().toString())
            .statutResv17(UUID.randomUUID().toString())
            .pseudoRoomYn23(UUID.randomUUID().toString())
            .createurResv24(intCount.incrementAndGet())
            .nomCreateurResv25(UUID.randomUUID().toString())
            .codeGarantie26(UUID.randomUUID().toString())
            .flgDed27(UUID.randomUUID().toString())
            .codePays28(UUID.randomUUID().toString())
            .libPays29(UUID.randomUUID().toString())
            .codeNationalite30(UUID.randomUUID().toString())
            .libNationalite31(UUID.randomUUID().toString())
            .codeSource32(UUID.randomUUID().toString())
            .libSource33(UUID.randomUUID().toString())
            .codeGrandSource34(UUID.randomUUID().toString())
            .codeOrigine35(UUID.randomUUID().toString())
            .libOrigine36(UUID.randomUUID().toString())
            .codeMarche37(UUID.randomUUID().toString())
            .libMarche38(UUID.randomUUID().toString())
            .codeGrandMarche39(UUID.randomUUID().toString())
            .libGrandMarche40(UUID.randomUUID().toString())
            .codePrix41(UUID.randomUUID().toString())
            .categPrix42(UUID.randomUUID().toString())
            .libPrix43(UUID.randomUUID().toString())
            .numChb44(UUID.randomUUID().toString())
            .descriptionTypeChb45(UUID.randomUUID().toString())
            .codeTypeChb46(UUID.randomUUID().toString())
            .classChb47(UUID.randomUUID().toString())
            .caractChb48(UUID.randomUUID().toString())
            .typeChbDeReservation49(UUID.randomUUID().toString())
            .descriptionTypeChbDeResv50(UUID.randomUUID().toString())
            .codeTypeChbDeResv51(UUID.randomUUID().toString())
            .statutDeReservation52(UUID.randomUUID().toString())
            .circuitDistribution53(UUID.randomUUID().toString())
            .circuitDistribUserRegroup54(UUID.randomUUID().toString())
            .numCrs55(UUID.randomUUID().toString())
            .typeRefCrs56(UUID.randomUUID().toString())
            .statutPremier60(UUID.randomUUID().toString())
            .statutDernier62(UUID.randomUUID().toString())
            .statutDernierPseudo64(UUID.randomUUID().toString())
            .diffDtCreaAnn65(intCount.incrementAndGet())
            .diffDtArrAnn66(intCount.incrementAndGet())
            .leadtime67(intCount.incrementAndGet())
            .los68(intCount.incrementAndGet())
            .occupantsGroupe69(UUID.randomUUID().toString())
            .nbNuitee70(intCount.incrementAndGet())
            .nbNuiteeNnDed71(intCount.incrementAndGet())
            .nbResvAnn72(intCount.incrementAndGet())
            .nbAdu73(intCount.incrementAndGet())
            .nbEnf74(intCount.incrementAndGet())
            .nbPersDayU75(intCount.incrementAndGet())
            .nbPersArr76(intCount.incrementAndGet())
            .nbPersDep77(intCount.incrementAndGet())
            .nbPersAnn78(intCount.incrementAndGet())
            .nbPersNoshow79(intCount.incrementAndGet())
            .nbChbDayU80(intCount.incrementAndGet())
            .nbChbArr81(intCount.incrementAndGet())
            .nbChbDep82(intCount.incrementAndGet())
            .nbChbAnn83(intCount.incrementAndGet())
            .nbChbNoshow84(intCount.incrementAndGet())
            .revenuNetChambre85(longCount.incrementAndGet())
            .revenuTaxeChambre86(longCount.incrementAndGet())
            .revenuNetChambreGlobal87(longCount.incrementAndGet())
            .revenuTaxeChambreGlobal88(longCount.incrementAndGet())
            .revenuNetBq89(longCount.incrementAndGet())
            .revenuTaxeBq90(longCount.incrementAndGet())
            .revenuNetBqGlobal91(longCount.incrementAndGet())
            .revenuTaxeBqGlobal92(longCount.incrementAndGet())
            .revenuNetExtra93(longCount.incrementAndGet())
            .revenuTaxeExtra94(longCount.incrementAndGet())
            .revenuNetExtraGlobal95(longCount.incrementAndGet())
            .revenuTaxeExtraGlobal96(longCount.incrementAndGet())
            .revenuNetTotal97(longCount.incrementAndGet())
            .revenuTaxeTotal98(longCount.incrementAndGet())
            .revenuNetTotalGlobal99(longCount.incrementAndGet())
            .revenuTaxeTotalGlobal100(longCount.incrementAndGet())
            .prodRevenuChambre101(longCount.incrementAndGet())
            .prodRevenuBq102(longCount.incrementAndGet())
            .prodRevenuExtra103(longCount.incrementAndGet())
            .prodRevenuTotal104(longCount.incrementAndGet())
            .prodChambreNbNuitees105(longCount.incrementAndGet())
            .numLigne108(intCount.incrementAndGet())
            .resort109(UUID.randomUUID().toString())
            .resvNameId110(intCount.incrementAndGet())
            .clientOId111(UUID.randomUUID().toString())
            .typeChb112(UUID.randomUUID().toString())
            .confirmationNo113(UUID.randomUUID().toString())
            .clientMdmId114(UUID.randomUUID().toString())
            .nameId115(intCount.incrementAndGet())
            .parentResvNameId116(intCount.incrementAndGet())
            .contactId117(intCount.incrementAndGet())
            .agenceId118(intCount.incrementAndGet())
            .agenceNom119(UUID.randomUUID().toString())
            .societeId120(intCount.incrementAndGet())
            .groupeId121(intCount.incrementAndGet())
            .numBloc122(intCount.incrementAndGet())
            .typeResv123(UUID.randomUUID().toString())
            .statutResv124(UUID.randomUUID().toString())
            .pseudoRoomYn130(UUID.randomUUID().toString())
            .createurResv131(intCount.incrementAndGet())
            .nomCreateurResv132(UUID.randomUUID().toString())
            .codeGarantie133(UUID.randomUUID().toString())
            .flgDed134(UUID.randomUUID().toString())
            .codePays135(UUID.randomUUID().toString())
            .libPays136(UUID.randomUUID().toString())
            .codeNationalite137(UUID.randomUUID().toString())
            .libNationalite138(UUID.randomUUID().toString())
            .codeSource139(UUID.randomUUID().toString())
            .libSource140(UUID.randomUUID().toString())
            .codeGrandSource141(UUID.randomUUID().toString())
            .codeOrigine142(UUID.randomUUID().toString())
            .libOrigine143(UUID.randomUUID().toString())
            .codeMarche144(UUID.randomUUID().toString())
            .libMarche145(UUID.randomUUID().toString())
            .codeGrandMarche146(UUID.randomUUID().toString())
            .libGrandMarche147(UUID.randomUUID().toString())
            .codePrix148(UUID.randomUUID().toString())
            .categPrix149(UUID.randomUUID().toString())
            .libPrix150(UUID.randomUUID().toString())
            .numChb151(UUID.randomUUID().toString())
            .descriptionTypeChb152(UUID.randomUUID().toString())
            .codeTypeChb153(UUID.randomUUID().toString())
            .classChb154(UUID.randomUUID().toString())
            .caractChb155(UUID.randomUUID().toString())
            .typeChbDeReservation156(UUID.randomUUID().toString())
            .descriptionTypeChbDeResv157(UUID.randomUUID().toString())
            .codeTypeChbDeResv158(UUID.randomUUID().toString())
            .statutDeReservation159(UUID.randomUUID().toString())
            .circuitDistribution160(UUID.randomUUID().toString())
            .circuitDistribUserRegroup161(UUID.randomUUID().toString())
            .numCrs162(UUID.randomUUID().toString())
            .typeRefCrs163(UUID.randomUUID().toString())
            .statutPremier167(UUID.randomUUID().toString())
            .statutDernier169(UUID.randomUUID().toString())
            .statutDernierPseudo171(UUID.randomUUID().toString())
            .diffDtCreaAnn172(intCount.incrementAndGet())
            .diffDtArrAnn173(intCount.incrementAndGet())
            .leadtime174(intCount.incrementAndGet())
            .los175(intCount.incrementAndGet())
            .occupantsGroupe176(UUID.randomUUID().toString())
            .nbNuitee177(intCount.incrementAndGet())
            .nbNuiteeNnDed178(intCount.incrementAndGet())
            .nbResvAnn179(intCount.incrementAndGet())
            .nbAdu180(intCount.incrementAndGet())
            .nbEnf181(intCount.incrementAndGet())
            .nbPersDayU182(intCount.incrementAndGet())
            .nbPersArr183(intCount.incrementAndGet())
            .nbPersDep184(intCount.incrementAndGet())
            .nbPersAnn185(intCount.incrementAndGet())
            .nbPersNoshow186(intCount.incrementAndGet())
            .nbChbDayU187(intCount.incrementAndGet())
            .nbChbArr188(intCount.incrementAndGet())
            .nbChbDep189(intCount.incrementAndGet())
            .nbChbAnn190(intCount.incrementAndGet())
            .nbChbNoshow191(intCount.incrementAndGet())
            .revenuNetChambre192(longCount.incrementAndGet())
            .revenuTaxeChambre193(longCount.incrementAndGet())
            .revenuNetChambreGlobal194(longCount.incrementAndGet())
            .revenuTaxeChambreGlobal195(longCount.incrementAndGet())
            .revenuNetBq196(longCount.incrementAndGet())
            .revenuTaxeBq197(longCount.incrementAndGet())
            .revenuNetBqGlobal198(longCount.incrementAndGet())
            .revenuTaxeBqGlobal199(longCount.incrementAndGet())
            .revenuNetExtra200(longCount.incrementAndGet())
            .revenuTaxeExtra201(longCount.incrementAndGet())
            .revenuNetExtraGlobal202(longCount.incrementAndGet())
            .revenuTaxeExtraGlobal203(longCount.incrementAndGet())
            .revenuNetTotal204(longCount.incrementAndGet())
            .revenuTaxeTotal205(longCount.incrementAndGet())
            .revenuNetTotalGlobal206(longCount.incrementAndGet())
            .revenuTaxeTotalGlobal207(longCount.incrementAndGet())
            .prodRevenuChambre208(longCount.incrementAndGet())
            .prodRevenuBq209(longCount.incrementAndGet())
            .prodRevenuExtra210(longCount.incrementAndGet())
            .prodRevenuTotal211(longCount.incrementAndGet())
            .prodChambreNbNuitees212(longCount.incrementAndGet())
            .numLigne215(intCount.incrementAndGet())
            .resort216(UUID.randomUUID().toString())
            .resvNameId217(intCount.incrementAndGet())
            .clientOId218(UUID.randomUUID().toString())
            .typeChb219(UUID.randomUUID().toString())
            .confirmationNo220(UUID.randomUUID().toString())
            .clientMdmId221(UUID.randomUUID().toString())
            .nameId222(intCount.incrementAndGet())
            .parentResvNameId223(intCount.incrementAndGet())
            .contactId224(intCount.incrementAndGet())
            .agenceId225(intCount.incrementAndGet())
            .agenceNom226(UUID.randomUUID().toString())
            .societeId227(intCount.incrementAndGet())
            .groupeId228(intCount.incrementAndGet())
            .numBloc229(intCount.incrementAndGet())
            .typeResv230(UUID.randomUUID().toString())
            .statutResv231(UUID.randomUUID().toString())
            .pseudoRoomYn237(UUID.randomUUID().toString())
            .createurResv238(intCount.incrementAndGet())
            .nomCreateurResv239(UUID.randomUUID().toString())
            .codeGarantie240(UUID.randomUUID().toString())
            .flgDed241(UUID.randomUUID().toString())
            .codePays242(UUID.randomUUID().toString())
            .libPays243(UUID.randomUUID().toString())
            .codeNationalite244(UUID.randomUUID().toString())
            .libNationalite245(UUID.randomUUID().toString())
            .codeSource246(UUID.randomUUID().toString())
            .libSource247(UUID.randomUUID().toString())
            .codeGrandSource248(UUID.randomUUID().toString())
            .codeOrigine249(UUID.randomUUID().toString())
            .libOrigine250(UUID.randomUUID().toString())
            .codeMarche251(UUID.randomUUID().toString())
            .libMarche252(UUID.randomUUID().toString())
            .codeGrandMarche253(UUID.randomUUID().toString())
            .libGrandMarche254(UUID.randomUUID().toString())
            .codePrix255(UUID.randomUUID().toString())
            .categPrix256(UUID.randomUUID().toString())
            .libPrix257(UUID.randomUUID().toString())
            .numChb258(UUID.randomUUID().toString())
            .descriptionTypeChb259(UUID.randomUUID().toString())
            .codeTypeChb260(UUID.randomUUID().toString())
            .classChb261(UUID.randomUUID().toString())
            .caractChb262(UUID.randomUUID().toString())
            .typeChbDeReservation263(UUID.randomUUID().toString())
            .descriptionTypeChbDeResv264(UUID.randomUUID().toString())
            .codeTypeChbDeResv265(UUID.randomUUID().toString())
            .statutDeReservation266(UUID.randomUUID().toString())
            .circuitDistribution267(UUID.randomUUID().toString())
            .circuitDistribUserRegroup268(UUID.randomUUID().toString())
            .numCrs269(UUID.randomUUID().toString())
            .typeRefCrs270(UUID.randomUUID().toString())
            .statutPremier274(UUID.randomUUID().toString())
            .statutDernier276(UUID.randomUUID().toString())
            .statutDernierPseudo278(UUID.randomUUID().toString())
            .diffDtCreaAnn279(intCount.incrementAndGet())
            .diffDtArrAnn280(intCount.incrementAndGet())
            .leadtime281(intCount.incrementAndGet())
            .los282(intCount.incrementAndGet())
            .occupantsGroupe283(UUID.randomUUID().toString())
            .nbNuitee284(intCount.incrementAndGet())
            .nbNuiteeNnDed285(intCount.incrementAndGet())
            .nbResvAnn286(intCount.incrementAndGet())
            .nbAdu287(intCount.incrementAndGet())
            .nbEnf288(intCount.incrementAndGet())
            .nbPersDayU289(intCount.incrementAndGet())
            .nbPersArr290(intCount.incrementAndGet())
            .nbPersDep291(intCount.incrementAndGet())
            .nbPersAnn292(intCount.incrementAndGet())
            .nbPersNoshow293(intCount.incrementAndGet())
            .nbChbDayU294(intCount.incrementAndGet())
            .nbChbArr295(intCount.incrementAndGet())
            .nbChbDep296(intCount.incrementAndGet())
            .nbChbAnn297(intCount.incrementAndGet())
            .nbChbNoshow298(intCount.incrementAndGet())
            .revenuNetChambre299(longCount.incrementAndGet())
            .revenuTaxeChambre300(longCount.incrementAndGet())
            .revenuNetChambreGlobal301(longCount.incrementAndGet())
            .revenuTaxeChambreGlobal302(longCount.incrementAndGet())
            .revenuNetBq303(longCount.incrementAndGet())
            .revenuTaxeBq304(longCount.incrementAndGet())
            .revenuNetBqGlobal305(longCount.incrementAndGet())
            .revenuTaxeBqGlobal306(longCount.incrementAndGet())
            .revenuNetExtra307(longCount.incrementAndGet())
            .revenuTaxeExtra308(longCount.incrementAndGet())
            .revenuNetExtraGlobal309(longCount.incrementAndGet())
            .revenuTaxeExtraGlobal310(longCount.incrementAndGet());
    }
}
