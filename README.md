<img width="676" height="411" alt="image-8" src="https://github.com/user-attachments/assets/0c1cd5f5-9353-423f-8886-3d26de3c8d8d" />

-----
<br/>

## 🔧 CI/CD 파이프라인 구성 설명 

**지속적인 통합(CI)** 과 **지속적인 배포(CD)** 환경을 구축, 코드 변경 사항을 신속하고 안정적으로 배포할 수 있는 자동화된 파이프라인을 설계

## 🔁 1. Continuous Integration (CI)


- Git : 로컬 환경에서 Java 코드를 작성 후 Git 저장소에 커밋 및 푸시
- Jenkins : Git 저장소의 변경 사항 감지, 빌드 파이프라인을 자동으로 실행
  - 빌드 실행
  - 정적 분석 요청
- SonarQube : Jenkins와 연동, 코드 품질 분석 수행
  - 코드 복잡도, 보안 취약점, 중복 코드 등의 정적 분석 실시
  - 분석 결과를 Jenkins로 반환, 품질 기준 만족하지 못할 경우 배포를 중단

 
## 🚀 2. Continuous Deployment(CD)

- Ansible : Jenkins를 통과한 코드는 Ansible 통해 Docker 이미지 빌드 및 Push 작업 자동화
  - IaC 기반 환경 구성 정의
- Docker Registry : 빌드된 이미지를 사설 레지스트리에 Push
- Kubernetes : 레지스트리에 저장된 이미지 Pull, 배포 환경(클러스터)에 자동으로 적용
  - 무중단 배포 위한 전략적 구성(롤링 배포)   

