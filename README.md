# goorm-backend-java

구름(goorm) 백엔드 Java 학습 및 과제 제출을 위한 저장소입니다.

---

## 📌 프로젝트 개요

- Java 기초 문법 및 주요 개념 학습
- 과제 및 실습 코드 정리
- 콘솔 기반 프로그램 위주로 구성

---

## 🛠 사용 기술

- Java 17
- IntelliJ IDEA
- Git & GitHub

---

## 🧭 Git 상황별 실전 가이드

이 저장소를 사용하면서 헷갈리기 쉬운 Git 상황을 빠르게 해결하기 위한 매뉴얼입니다.  
개념 설명은 최소화하고, **상황 → 바로 쓸 명령어** 위주로 정리했습니다.

---

### 0️⃣ 작업 전 항상 확인
```bash
git status
git branch
```

---

### 1️⃣ 원격 저장소 최신 코드 받기

#### ✔️ 로컬 수정 없음
```bash
git pull origin main
```

#### ✔️ 로컬 수정 있음 (권장)
```bash
git pull --rebase origin main
```

---

### 2️⃣ 작업 중인데 pull 받아야 할 때 (커밋 전)
```bash
git stash
git pull origin main
git stash pop
```

---

### 3️⃣ 과제 / 실습 코드 원격에 올리기
```bash
git add .
git commit -m "과제: Chapter01 실습"
git push origin main
```

---

### 4️⃣ 브랜치 이동 / 생성
```bash
git branch                    # 브랜치 목록 확인
git checkout 브랜치명         # 브랜치 이동
git checkout -b 브랜치명      # 새 브랜치 생성 후 이동
```

---

### 5️⃣ 충돌(conflict) 발생 시

#### ✔️ rebase 중 충돌
```bash
# 충돌 파일 수정 후
git add .
git rebase --continue
```

#### ✔️ merge 충돌
```bash
# 충돌 파일 수정 후
git add .
git commit
```

---

### 6️⃣ 로컬 상태가 꼬였을 때 (⚠️ 주의)

> 로컬 변경사항을 전부 버리고 원격 상태와 동일하게 맞춥니다.
```bash
git fetch origin
git reset --hard origin/main
```

---

### 7️⃣ 커밋 실수했을 때

#### ✔️ 마지막 커밋 취소 (코드는 유지)
```bash
git reset --soft HEAD~1
```

#### ✔️ 커밋 + 코드 모두 취소
```bash
git reset --hard HEAD~1
```

---

### 8️⃣ 자주 쓰는 확인 명령어
```bash
git log --oneline --graph --all
git diff
git stash list
```

---

### 9️⃣ Fork 워크플로우 (원본 저장소 → 내 저장소 → PR)

#### ✔️ 최초 설정 (한 번만)
```bash
# 1. GitHub에서 원본 저장소 Fork
# 2. Fork한 내 저장소를 로컬에 clone
git clone https://github.com/내계정/goorm-backend-java.git
cd goorm-backend-java

# 3. 원본 저장소를 upstream으로 추가
git remote add upstream https://github.com/원본계정/goorm-backend-java.git

# 4. 확인
git remote -v
# origin    https://github.com/내계정/goorm-backend-java.git (fetch)
# origin    https://github.com/내계정/goorm-backend-java.git (push)
# upstream  https://github.com/원본계정/goorm-backend-java.git (fetch)
# upstream  https://github.com/원본계정/goorm-backend-java.git (push)
```

#### ✔️ 원본 저장소 최신 코드 가져오기
```bash
# upstream에서 최신 코드 받기
git fetch upstream
git merge upstream/main

# 또는 rebase (권장)
git pull --rebase upstream main

# 내 원격 저장소에도 반영
git push origin main
```

#### ✔️ 작업 후 PR 보내기
```bash
# 1. 작업용 브랜치 생성
git checkout -b feature/chapter01

# 2. 작업 후 커밋
git add .
git commit -m "과제: Chapter01 실습 완료"

# 3. 내 원격 저장소에 푸시
git push origin feature/chapter01

# 4. GitHub에서 Pull Request 생성
# (내 저장소 → 원본 저장소로 PR)
```

#### ✔️ PR 승인 후 브랜치 정리
```bash
# main 브랜치로 이동
git checkout main

# 원본 저장소 최신 코드 받기
git pull --rebase upstream main

# 작업 브랜치 삭제
git branch -d feature/chapter01

# 원격 브랜치 삭제
git push origin --delete feature/chapter01
```

#### ✔️ 일상적인 작업 흐름
```bash
# 1. 작업 시작 전 원본 최신화
git checkout main
git pull --rebase upstream main
git push origin main

# 2. 새 작업 브랜치 생성
git checkout -b feature/새작업

# 3. 작업 + 커밋 + 푸시
git add .
git commit -m "작업 내용"
git push origin feature/새작업

# 4. GitHub에서 PR 생성

# 5. PR 승인되면 브랜치 정리 후 1번으로
```

---

## ⭐ 추천 사용 흐름

### 개인 저장소 사용 시
1. **작업 시작** → `git pull --rebase`
2. **작업 중** → 수시로 `git status`
3. **커밋 전** → 다시 `git pull --rebase`
4. **문제 발생** → `stash` / `reset` 중 상황에 맞게 선택

### Fork 워크플로우 사용 시
1. **작업 시작** → `git pull --rebase upstream main`
2. **새 브랜치** → `git checkout -b feature/작업명`
3. **작업 완료** → commit → push → PR
4. **PR 승인 후** → 브랜치 정리 → 1번으로

---

> 이 가이드는 Java 학습 및 과제 제출 과정에서 Git 사용으로 인한 실수를 줄이기 위한 목적으로 작성되었습니다.