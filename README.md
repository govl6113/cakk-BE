<img src="https://github.com/Prography-8th-team8/team8-BE/assets/43109589/a2d04c49-a351-48b0-9df6-b979ffbb81df" width="300" height="300"/>

# 케이크크

## 프로젝트 설명

위치기반 케이크샵 지도 어플로, 원하는 케이크샵을 확인하고 상세정보를 확인할 수 있습니다.
(현재 서울지역에서 서비스 중)

[케이크크 IOS 앱스토어 실적]
- 기준일: 23.08.12
- 총 노출 수: 2.9천
- 총 다운로드 수(재설치 제외): 105건 -> 288건(2023.12.27 기준)
- 전환율: 5.83%

<br>

## 기능
![2030](https://github.com/govl6113/cakk-BE/assets/81179951/9d554828-1353-49b1-9f92-b29dc7bdd74a)
![2031](https://github.com/govl6113/cakk-BE/assets/81179951/a5ca5c1c-d5bf-4753-8f65-b52dd449e98f)

<br>

## 개발 내용

1. admin 케이크샵 이미지 업로드 
2. admin 케이크샵 카테고리 업로드
3. 케이크샵 리스트 조회
    1. 지역별로 조회
    2. 이 지역 재검색
4. 케이크샵 상세 조회
5. 케이크샵 카테고리 조회
6. 케이크샵 관련 네이버 블로그 조회
7. 케이크샵 관련 네이버 가게 정보 조회
8. 랜덤 케이크 사진으로 피드 조회

### 개발하며 고민한 것들 -> [고민 흔적남기기 click](https://brash-wanderer-5cd.notion.site/7c995f38249e411ca7ac9f6211f8c723?pvs=4)

<br>
<br>

## 기술스택

**`Backend`**: **Java, Spring Boot**

**`Database`**: **queryDSL, JPA, PostgreSQL**

**`CI/CD`**: **Docker, Jenkins, Github actions**

**`AWS`**: **EC2, RDS, S3**

**`Test`**: **K6, Grafana, Prometheus**

**`외부API`** : **Naver 서비스 API**

**`Etc`**: **Swagger**

<br>

## 시스템 아키텍처

<img width="639" alt="pic2" src="https://github.com/Prography-8th-team8/team8-BE/assets/43109589/e3e16e9e-48b4-454a-a3ab-1c22ae9e30ff">

<br/>
<br/>
<br/>

## ERD

<img width="941" alt="pic1" src="https://github.com/Prography-8th-team8/team8-BE/assets/43109589/3b9c7c92-8f9a-4902-9993-3f8f8752b7e2">

<br/>
<br/>
<br/>

## Issue & PR 
[Issue click](https://github.com/Prography-8th-team8/team8-BE/issues)

[PR click](https://github.com/Prography-8th-team8/team8-BE/pulls)

<br>
<br>
<br>

## 실행 화면

1. 내 위치 허용 안함 -> 지역 이동 -> 상세보기 -> 사진 -> 블로그 -> 북마크 저장

https://github.com/govl6113/cakk-BE/assets/81179951/a587151a-2468-4abf-8ddd-b1305b3f9334

<br>

2. 내 위치 허용(허용하면 자동으로 내 위치 주변 케이크샵이 조회됨) -> 이 지역 재검색 -> 리스트 -> 상세보기 -> 블로그 -> 공유하기 (인스타그램)

https://github.com/govl6113/cakk-BE/assets/81179951/17745c69-0479-43d3-945b-c3c2d12b989e

<br>

3. 내 위치 허용(허용하면 자동으로 내 위치 주변 케이크샵이 조회됨) -> 이 지역 재검색 -> 리스트 -> 상세보기 -> 블로그 -> 공유하기 (카카오톡)

https://github.com/govl6113/cakk-BE/assets/81179951/d64d3669-3e47-4bf1-8b93-466394018db0

<br>

4. 필터링 -> 리스트 -> 상세보기 -> 필터링 해제

https://github.com/govl6113/cakk-BE/assets/81179951/966eccf5-7f3c-40e8-813f-6a76826bf05f

<br>

5. 이 지역 재검색 -> 리스트 -> 북마크 -> 내가 찜한 케이크샵 리스트 -> 북마크 해제

https://github.com/govl6113/cakk-BE/assets/81179951/ced72a04-a74f-4eba-8f7e-73219f94de60

<br>

6. 피드 -> 케이크샵 방문 -> 북마크 -> 웹사이트 방문

https://github.com/govl6113/cakk-BE/assets/81179951/881dd9a9-7ee5-444b-8964-6ce1b59c8f4e

<br>

7. 필터링 -> 리스트 -> 사진 확대 -> 필터링 해제 

https://github.com/govl6113/cakk-BE/assets/81179951/4ffb5bac-a6f6-4f21-b8d6-d1f37f1682d3

<br>

8. 이 지역 재검색 -> 상세보기 -> 사진 확대 -> 북마크 

https://github.com/govl6113/cakk-BE/assets/81179951/567877a6-0d14-4db6-b427-c84ddb7c2c2d

<br>
<br>

## 성능 테스트
K6를 사용해 부하를 주고, Prometheus와 Grafana를 이용해 모니터링을 진행했습니다. <br>

### 성능테스트 목표설정
1일 총 요청수 = 1,000,000(백만) <br>
1일 평균 rps(request per second) = 1,000,000 (백만) / 43200(12시간) = 23rps <br>
1일 최대 rps = 1일 평균 rps * 피크 시간 집중률 = 23rps * 50 = 1150 rps <br>
즉, throughput은 23(1일 평균 rps) ~ 115(1일 최대 rps)가 나오게 됩니다. 이 정보를 통해서 VUser를 계산할 수 있습니다.<br>
<br>

목표 rps = Vuser * 1초당 요청 횟수 <br>
Vuser = 목표 rps / 1초당 요청 횟수 <br>
Vuser = 목표 rps * (한 번의 시나리오를 완료하는데 걸리는 시간) / (시나리오 당 요청수 = 1이니까 제외) <br>
Vuser = 목표 rps * (한 번의 시나리오를 완료하는데 걸리는 시간) <br>
평균 Vuser = 23 * 0.1s = 2 <br>
최대 Vuser = 1150 * 0.1(0.02 WAS 로직처리 + DB조회 0.08)s = 115 <br>

참고: [https://velog.io/@sontulip/performance-test#테스트의-목표](https://velog.io/@sontulip/performance-test#%ED%85%8C%EC%8A%A4%ED%8A%B8%EC%9D%98-%EB%AA%A9%ED%91%9C)<br>

### 성능테스트 결과
![성능테스트3](https://github.com/govl6113/cakk-BE/assets/81179951/a5a9429f-fad6-4785-8e47-799b9f2bfb88)
