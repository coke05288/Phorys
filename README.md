# 📸 Phorys

사용자가 사진을 업로드하고 폴라로이드 스타일로 메모와 함께 게시하여 소중한 추억을 아카이빙할 수 있는 웹 애플리케이션입니다. 

<br>

## 🌟 주요 기능

- **사진 업로드**: 폴라로이드 스타일 레이아웃으로 메모와 함께 사진을 업로드할 수 있습니다.
- **이미지 리사이징**: AWS Lambda를 사용하여 업로드된 이미지를 자동으로 리사이징하여 저장 공간과 성능을 최적화합니다.

<br>

## 🛠️ 기술 스택

### 백엔드
- **Spring Boot** (Java Corretto 17) : 사용자 관리 및 Lambda 연결
- **AWS Lambda** (Python 3.12) : 이미지 리사이징 및 처리 / 사진 CRUD

### 프론트엔드
- **Thymeleaf** (버전 3.1)
- **Bootstrap** (버전 5.3)

### 데이터베이스 및 스토리지
- **AWS S3**: 업로드 원본 이미지와 리사이징 이미지 저장
- **MariaDB**: 사용자 데이터, 메모, 이미지 메타데이터 등 저장

<br>

## 👥 개발자

- **coke05288(coke05288@gmail.com)** : 웹 서비스 개발(Spring Boot, Thymeleaf)
- **ponyo00(1000yums@gmail.com)** : 이미지 리사이징 구현(AWS Lambda, Python) 
- **hizju(satusna@gmail.com)** :
- **legitkarl9** : 

<br>
