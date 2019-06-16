# client

Exceptions - 

1- SunCertPathBuilderException: unable to find valid certification path to requested target

Solution - 

1 - Download InstallCert.java
2 - Compile InstallCert.java
3 - Run InstallCert.java, with your hostname and https port, 
    and press “1” when ask for input. It will add your “localhost” as a trusted keystore, 
    and generate a file named “jssecacerts“.
    
    $ java InstallCert localhost:8085
    Loading KeyStore /home/vineet/Software/jdk1.8.0_211/jre/lib/security/cacerts...
Opening connection to localhost:8085...
Starting SSL handshake...

javax.net.ssl.SSLHandshakeException: sun.security.validator.ValidatorException: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
	at sun.security.ssl.Alerts.getSSLException(Alerts.java:192)
	at sun.security.ssl.SSLSocketImpl.fatal(SSLSocketImpl.java:1946)
	at sun.security.ssl.Handshaker.fatalSE(Handshaker.java:316)
	at sun.security.ssl.Handshaker.fatalSE(Handshaker.java:310)
	at sun.security.ssl.ClientHandshaker.serverCertificate(ClientHandshaker.java:1639)
	at sun.security.ssl.ClientHandshaker.processMessage(ClientHandshaker.java:223)
	at sun.security.ssl.Handshaker.processLoop(Handshaker.java:1037)
	at sun.security.ssl.Handshaker.process_record(Handshaker.java:965)
	at sun.security.ssl.SSLSocketImpl.readRecord(SSLSocketImpl.java:1064)
	at sun.security.ssl.SSLSocketImpl.performInitialHandshake(SSLSocketImpl.java:1367)
	at sun.security.ssl.SSLSocketImpl.startHandshake(SSLSocketImpl.java:1395)
	at sun.security.ssl.SSLSocketImpl.startHandshake(SSLSocketImpl.java:1379)
	at InstallCert.main(InstallCert.java:87)
Caused by: sun.security.validator.ValidatorException: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
	at sun.security.validator.PKIXValidator.doBuild(PKIXValidator.java:397)
	at sun.security.validator.PKIXValidator.engineValidate(PKIXValidator.java:302)
	at sun.security.validator.Validator.validate(Validator.java:262)
	at sun.security.ssl.X509TrustManagerImpl.validate(X509TrustManagerImpl.java:330)
	at sun.security.ssl.X509TrustManagerImpl.checkTrusted(X509TrustManagerImpl.java:237)
	at sun.security.ssl.X509TrustManagerImpl.checkServerTrusted(X509TrustManagerImpl.java:113)
	at InstallCert$SavingTrustManager.checkServerTrusted(InstallCert.java:182)
	at sun.security.ssl.AbstractTrustManagerWrapper.checkServerTrusted(SSLContextImpl.java:1099)
	at sun.security.ssl.ClientHandshaker.serverCertificate(ClientHandshaker.java:1621)
	... 8 more
Caused by: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
	at sun.security.provider.certpath.SunCertPathBuilder.build(SunCertPathBuilder.java:141)
	at sun.security.provider.certpath.SunCertPathBuilder.engineBuild(SunCertPathBuilder.java:126)
	at java.security.cert.CertPathBuilder.build(CertPathBuilder.java:280)
	at sun.security.validator.PKIXValidator.doBuild(PKIXValidator.java:392)
	... 16 more

Server sent 1 certificate(s):

 1 Subject CN=localhost, OU=Unknown, O=Unknown, L=Unknown, ST=Unknown, C=Unknown
   Issuer  CN=localhost, OU=Unknown, O=Unknown, L=Unknown, ST=Unknown, C=Unknown
   sha1    c5 20 c1 c6 5f 3c 51 8a e1 03 74 53 d4 04 63 a6 7e f6 65 ca 
   md5     a8 b2 ce 46 69 f7 be 52 23 98 09 f8 8d ed a2 77 

Enter certificate to add to trusted keystore or 'q' to quit: [1]
1

[
[
  Version: V3
  Subject: CN=localhost, OU=Unknown, O=Unknown, L=Unknown, ST=Unknown, C=Unknown
  Signature Algorithm: SHA256withRSA, OID = 1.2.840.113549.1.1.11

  Key:  Sun RSA public key, 2048 bits
  modulus: 26805751199267395010063687812555479597150597268765523837236954669570001665506318263119721620350681662142756684245054411556176948073305315735566726748144144235595088217943643765460357503677595362897582661468767036953889912056784716681937438151277557877080906604831051299113730463881050123861652901158977411317920585383568538858621949121576349357796770711225673423725619306309343458153548388803716249748958730409780814311223202180249238741215690001901780921651710751915322462887911337855296395082636767375471807147430896065993164973068977407118467986843698374758763105833334664638941664279801734511139033513549222510129
  public exponent: 65537
  Validity: [From: Mon Jun 17 04:20:19 IST 2019,
               To: Thu Jun 14 04:20:19 IST 2029]
  Issuer: CN=localhost, OU=Unknown, O=Unknown, L=Unknown, ST=Unknown, C=Unknown
  SerialNumber: [    3f46f716]

Certificate Extensions: 1
[1]: ObjectId: 2.5.29.14 Criticality=false
SubjectKeyIdentifier [
KeyIdentifier [
0000: 8C ED 7B C0 41 C4 84 9B   A1 0B 25 3D B7 8F 18 FB  ....A.....%=....
0010: E7 F6 19 7F                                        ....
]
]

]
  Algorithm: [SHA256withRSA]
  Signature:
0000: CD A4 32 FB CD C5 A2 58   C5 3C 3E B6 63 E7 67 E3  ..2....X.<>.c.g.
0010: 06 96 31 E3 8F 86 8D 15   22 C5 F5 8A DF 9F C8 BE  ..1.....".......
0020: 93 52 16 3E A2 C5 D7 AA   93 AA 8A A1 E2 EC 7B E6  .R.>............
0030: B5 68 E8 F5 16 5B 44 BD   2C 25 01 66 A4 BA 58 E0  .h...[D.,%.f..X.
0040: 3E 1B DC 4B 8D 27 B9 7C   BD CA 9E BB D3 5F 44 68  >..K.'......._Dh
0050: FC 54 25 4A CF 40 E5 27   0A 38 B6 AB 69 70 2B 1A  .T%J.@.'.8..ip+.
0060: 6F 72 21 39 92 74 38 A5   45 77 62 CC F9 EF E1 A2  or!9.t8.Ewb.....
0070: E8 FD 2C D5 F2 20 1B 07   76 70 9C 98 B7 EB 32 40  ..,.. ..vp....2@
0080: F4 3D 3E 65 C3 6B CD 2D   FD 08 D6 77 36 E6 BA E7  .=>e.k.-...w6...
0090: E0 CA 48 FF C2 E9 8D E6   D4 FD 4B 57 85 9C 23 DA  ..H.......KW..#.
00A0: 57 6B F8 1D 21 7B 0D 30   78 98 FD 58 61 FF 83 58  Wk..!..0x..Xa..X
00B0: AA 56 68 C3 94 8B 75 0D   5C 71 0A F7 F5 32 21 AA  .Vh...u.\q...2!.
00C0: 3D 43 E7 A3 54 C4 DD DE   AA 53 C2 60 C6 DC 6D E4  =C..T....S.`..m.
00D0: E6 B1 0A D2 9D BF 64 E0   54 62 70 90 9F 5E 4D E1  ......d.Tbp..^M.
00E0: D7 6F D3 38 A2 F3 10 A7   4B 45 E6 96 8F 7D AC F8  .o.8....KE......
00F0: 53 E7 9C FD B1 26 BE F8   A4 3D A3 93 32 07 4B BF  S....&...=..2.K.

]

Added certificate to keystore 'jssecacerts' using alias 'localhost-1'

5- Verify Trusted Keystore

  $ java InstallCert localhost:8085
Loading KeyStore jssecacerts...
Opening connection to localhost:8085...
Starting SSL handshake...

javax.net.ssl.SSLException: java.lang.UnsupportedOperationException
	at sun.security.ssl.Alerts.getSSLException(Alerts.java:208)
	at sun.security.ssl.SSLSocketImpl.fatal(SSLSocketImpl.java:1946)
	at sun.security.ssl.SSLSocketImpl.fatal(SSLSocketImpl.java:1903)
	at sun.security.ssl.SSLSocketImpl.handleException(SSLSocketImpl.java:1886)
	at sun.security.ssl.SSLSocketImpl.startHandshake(SSLSocketImpl.java:1402)
	at sun.security.ssl.SSLSocketImpl.startHandshake(SSLSocketImpl.java:1379)
	at InstallCert.main(InstallCert.java:87)
Caused by: java.lang.UnsupportedOperationException
	at InstallCert$SavingTrustManager.getAcceptedIssuers(InstallCert.java:171)
	at sun.security.ssl.AbstractTrustManagerWrapper.checkAlgorithmConstraints(SSLContextImpl.java:1212)
	at sun.security.ssl.AbstractTrustManagerWrapper.checkAdditionalTrust(SSLContextImpl.java:1158)
	at sun.security.ssl.AbstractTrustManagerWrapper.checkServerTrusted(SSLContextImpl.java:1100)
	at sun.security.ssl.ClientHandshaker.serverCertificate(ClientHandshaker.java:1621)
	at sun.security.ssl.ClientHandshaker.processMessage(ClientHandshaker.java:223)
	at sun.security.ssl.Handshaker.processLoop(Handshaker.java:1037)
	at sun.security.ssl.Handshaker.process_record(Handshaker.java:965)
	at sun.security.ssl.SSLSocketImpl.readRecord(SSLSocketImpl.java:1064)
	at sun.security.ssl.SSLSocketImpl.performInitialHandshake(SSLSocketImpl.java:1367)
	at sun.security.ssl.SSLSocketImpl.startHandshake(SSLSocketImpl.java:1395)
	... 2 more

Server sent 1 certificate(s):

 1 Subject CN=localhost, OU=Unknown, O=Unknown, L=Unknown, ST=Unknown, C=Unknown
   Issuer  CN=localhost, OU=Unknown, O=Unknown, L=Unknown, ST=Unknown, C=Unknown
   sha1    c5 20 c1 c6 5f 3c 51 8a e1 03 74 53 d4 04 63 a6 7e f6 65 ca 
   md5     a8 b2 ce 46 69 f7 be 52 23 98 09 f8 8d ed a2 77 

Enter certificate to add to trusted keystore or 'q' to quit: [1]

Exception - javax.net.ssl.SSLException: java.lang.UnsupportedOperationException

Solution - it's simple, on your implementation of X509TrustManager

You just have to return an X509Certificate array. And that's all!

    @Override
    public X509Certificate[] getAcceptedIssuers() {
        return new X509Certificate[0];
        // throw new UnsupportedOperationException();
    }

6 - Copy jssecacerts
Copy the generated “jssecacerts” file to your “$JAVA_HOME\jre\lib\security” folder.
  
