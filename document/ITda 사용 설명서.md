# ITda 사용 설명서

## 0. 기본 세팅

__구성품 확인__

- 라즈베리파이
- Google USB accelerator | Coral
- micro HDMI - HDMI 케이블
- HC-SR04 (초음파센서)
- micor SD card 32G (Raspbian 내장)

------------------------- 미배송품 -------------------------

- CAM, 마이크 (테스트 과정에서는 USB포트의 CAM과 마이크가 합쳐진 기기 사용)
- TV
- wifi 혹은 LAN 케이블
- 충전케이블 (C type)
- Google cloud 계정 (유료)



### 인터넷 연결

#### LAN을 사용하는 경우

LAN cable을 라즈베리파이에 연결한다.

#### Wifi를 사용하는 경우

프로그램 실행 파트에서 설명.



## 1. 조립

라즈비안에 아래의 장비들을 결합한다.

| 장비                   | 사진                                                         | 설명 |
| ---------------------- | ------------------------------------------------------------ | ------------------------------------------------------------ |
| 충전기                 | <img src="ITda 사용 설명서.assets/image-20210625113455669.png" alt="image-20210625113455669" style="zoom:33%;" /> |C-type 포트에 연결한다.|
| Google USB accelerator | <img src="ITda 사용 설명서.assets/image-20210625113551910.png" alt="image-20210625113551910" style="zoom:33%;" /> |USB 포트에 연결한다.<br />TPU는 C-type 포트이다.|
| micro HDMI cable       | <img src="ITda 사용 설명서.assets/image-20210625113611985.png" alt="image-20210625113611985" style="zoom:33%;" /> |TV의 HDMI 포트에 연결한다.|
| 카메라, 마이크         | <img src="ITda 사용 설명서.assets/image-20210625113627541.png" alt="image-20210625113627541" style="zoom:33%;" /> |테스트에는 카메라와 마이크가 합쳐진 장비를 사용했고, USB 포트에 입력했다.|
| 마우스, 키보드         | <img src="ITda 사용 설명서.assets/image-20210625113641001.png" alt="image-20210625113641001" style="zoom:33%;" /> |마우스, 키보드를 USB 포트에 연결한다.|
| 초음파 센서            | <img src="ITda 사용 설명서.assets/image-20210625114748992.png" alt="image-20210625114748992" style="zoom:33%;" /><img src="ITda 사용 설명서.assets/pi_GPIO.png" alt="img" style="zoom: 67%;" /> |초음파센서를 그림에 보이는대로 연결한다.|
| micro SD card          | <img src="ITda 사용 설명서.assets/image-20210625115122908.png" alt="image-20210625115122908" style="zoom:33%;" /> |라즈베리파이 뒷면에 micro SD카드를 장착한다.|
| LAN (추가)             | <img src="ITda 사용 설명서.assets/image-20210625115353033.png" alt="image-20210625115353033" style="zoom:33%;" /> |만약 wifi가 아닌 LAN을 사용한다면, 그림에 보이는 포트를 이용한다.|

조립을 완료한 후 (혹은 충전 케이블을 재연결 하면) 라즈비안이 실행된다.

실행시 아래와 같은 화면이 디스플레이(TV에 출력된다.)

![image-20210625223149227](ITda 사용 설명서.assets/image-20210625223149227.png)

비밀번호가 단순해서 뜨는 경고문인데, 무시해도 괜찮다.



## 2. Google API 키 발급

ITda에서 사용하는 STT, TTS는 모두 `google cloud api`이므로, google에서 api 신청을 해야한다.

https://console.cloud.google.com/에 접속한다.

결제 계정으로 로그인 한다.



![img](ITda 사용 설명서.assets/bXzVpoISu8Fy7SyXg_uZvztcXPvDqE7x_Bg2jsyb3PlUXtHoTN0y7aK3vOYn_HJHPOBT_KejgVQK0Axwi43CQH_mUTYAdV6Mf9BO989DJDHW392cVirLVmXQ_tRv2gpHV42q2n34)

대시보드의 `프로젝트 만들기` 버튼을 누른다.



![img](ITda 사용 설명서.assets/NqpQLIJ-vMkoOcLu8Tp_zdfhsSIhCVFQ18A9xMlSs41yZN2qZlTn3NK05Nh7_5foZCC8x6mFzmzFhgP6VsaYE-iyJfSQVtIkpavcPwVHzqzNmxg_Zk7fckmiQNQJqRsc7XIw7qBZ)

프로젝트 이름을`itda`로 작성한다. (다른거여도 되긴 함)



![img](ITda 사용 설명서.assets/DXRe3m69OgsiXQ1h_WQKKx0ZDCCWL82oHl8aUNFEEFJCaSPBT8U881PYUZgkmF8yuIpdK4HVJN_u_0R55gJXWMZj1ClGBsatMed1QKpGWSgZx0awIkZnnBuXala0Y9NXLwnoAzpI)

`API 및 서비스 사용 설정` 버튼을 누른다.



![img](ITda 사용 설명서.assets/5N-NIt7zVi8YgqcdErURlha1RnMiDDeoFv6w0BDGXWoi0OyWrpJwy29BpLFnJuH_Mki5jjSoP-SVnxuTHFA-TA1_Dw_p_mmLI1ioSveGNTwqf79Yn0NqIg7vinsA_62MfyDLsc92)

위 그림에 보이는 `Cloud Text-to-Speech API`와 `Cloud Speech-to-Text API`를 모두 사용 할 것이다.

각각 클릭한 뒤 `사용` 버튼을 눌러준다.



![image-20210625230917640](ITda 사용 설명서.assets/image-20210625230917640.png)

`사용자 인증 정보 만들기` -> `서비스 계정`을 누른다.



![image-20210625230958793](ITda 사용 설명서.assets/image-20210625230958793.png)

`서비스 계정 이름` 만 작성하고 `가입 완료 민 계속`을 누른다.



![img](https://lh5.googleusercontent.com/u3kIMtCQKVsXCwOyPWaz1pxKv53VNCrO7y13V2uSs1Hy1TK7i5ADJm6oB71h4O_QOhfJfp22xOt0iIiS43WXWDlyVvp2zxOhG2wo2HFTel33N9svw73QwjeWFdcrndQtnbVyLpGC)

역할에 `소유자`를 선택 후 `완료`를 누른다.



![img](ITda 사용 설명서.assets/ZiSGittmNlyPDRSWmI6W35TZYvsHDhTVhwOBonFm1i9Sfgb8-6ZENPZYggaqs4KxBC663SazVA9yr7f2xy9p-QiBhzm4td232VH1a5RZaJ_UL2Q1EiA71QIn26zTJecuWRjjscTg)

`작업`의 `...`의 `키 만들기`를 누른다.



![img](ITda 사용 설명서.assets/ejYjJji2wbQcMUseL8gpvRtlk0vIPKXnQBNvgw7L2gQiathZcCuhQyFkSnVFY2iL6oec6EBIqWff5Cvsnr4rGa1QwqMgCBdhAo3nVZzTqa-UUS7DiSs0-BK1bVTobO2zDUFm2mkg)

`JSON`을 선택 후 `만들기`를 누르면 컴퓨터에 키가 다운받아진다.



이제 다시 라즈베리파이로 돌아와서, `itda-317903-188a8deb1978.json` 파일을 찾는다.

경로는 `/home/pi/s04p23a404/Edge/itda-317903-188a8deb1978.json`이다.



![image-20210625231538458](ITda 사용 설명서.assets/image-20210625231538458.png)

방금 받았던 키를 이 파일 안에 그대로 복사해준다.

(형태는 대충 아래처럼 생겼다.)

```json
{
  "type": "...",
  "project_id": "...",
  "private_key_id": "...",
  "private_key": "-----BEGIN PRIVATE KEY-----......",
  "client_email": "...",
  "client_id": "...",
  "auth_uri": "...",
  "token_uri": "...",
  "auth_provider_x509_cert_url": "...",
  "client_x509_cert_url": "...",
}

```

이제 TTS, STT가 가능해졌다.



## 3. 프로그램 실행

### wifi 설정

만약 LAN이 아니라면 아래의 설정을 따른다.

![image-20210625223314267](ITda 사용 설명서.assets/image-20210625223314267.png)

`sudo raspi-config` 커멘드를 입력한다.

![image-20210625223405775](ITda 사용 설명서.assets/image-20210625223405775.png)

`1. System Options` 선택 후 enter

![image-20210625223445253](ITda 사용 설명서.assets/image-20210625223445253.png)

`S1 Wireless LAN` 선택 후 enter

![image-20210625223529086](ITda 사용 설명서.assets/image-20210625223529086.png)

`KR Korea (South)` 선택 후 enter

`k` 키를 누르면 빠르게 찾을 수 있다.

![image-20210625223625525](ITda 사용 설명서.assets/image-20210625223625525.png)

enter를 누른다.

![image-20210625223651858](ITda 사용 설명서.assets/image-20210625223651858.png)

접속 한 wifi의 SSID(wifi 이름)을 입력하고 enter를 누른다.

![image-20210625223732577](ITda 사용 설명서.assets/image-20210625223732577.png)

해당 wifi의 비밀번호를 입력 후 enter를 누른다.

![image-20210625223813378](ITda 사용 설명서.assets/image-20210625223813378.png)

![image-20210625223843176](ITda 사용 설명서.assets/image-20210625223843176.png)

`Finish`와 `예`를 눌러 재부팅한다.



### ITda 사이트 접속

![image-20210625225315230](ITda 사용 설명서.assets/image-20210625225315230.png)

로고 -> 인터넷 -> Chromium 브라우저 순서대로 클릭한다.

![image-20210625225422837](ITda 사용 설명서.assets/image-20210625225422837.png)

위 처럼 검은 화면이 보이면 정상적으로 실행이 된 것이다.

시작 페이지를 서비스 실행 화면으로 설정해두었는데, 만약 다른 주소가 나온다면 아래의 주소를 주소창에 적어 이동한다.

`http://j4a404.p.ssafy.io/senior/wait`



### Python 코드 실행

![image-20210625225559869](ITda 사용 설명서.assets/image-20210625225559869.png)

콘솔창을 열고 `code`라고 친 후 enter를 누르면 vscode가 실행된다.

이후 모든 창의 위치를 아래와 같도록 설정해둔다.

![image-20210625232117554](ITda 사용 설명서.assets/image-20210625232117554.png)

- vscode는 맨 위에 위아래 폭이 가장 작게 설정
- 터미널은 오른쪽 변이 화면의 가운데에 위치하게 설정



이렇게 설정하는 이유는 `오늘의체조` 컨텐츠 시 캠 화면이 적절한 위치에 있을 수 있도록 하는 것입니다.



이제 파이썬 코드를 실행하는 명령어를 작성한다.

![image-20210625232559369](ITda 사용 설명서.assets/image-20210625232559369.png)

```shell
cd s04p23a404/Edge/
python app.py
```

마지막으로 다시 브라우저를 선택 후 `F11`을 누른다.

![image-20210625232403503](ITda 사용 설명서.assets/image-20210625232403503.png)



이제 초음파센서가 작동하기 시작하고, 초음파센서가 20cm 이하의 물체를 탐지하면 `ITda` 서비스가 실행된다.

- 초음파센서의 오작동으로 인해 20cm 접근하지 않았음에도 불구하고 서비스가 시작될 수 있습니다.
- 초음파센서의 오작동으로 인해 서비스가 실행되지 않고 종료할 수 있으니 파이썬코드 입력 후 가능한 10분 이내에 서비스를 시작하는 것을 권장합니다.
- 만약 서비스 도중 오류가 발생한다면, 웹 브라우저 주소 `http://j4a404.p.ssafy.io/senior/wait`로 이동 후 다시 시작 해주시기 바랍니다.