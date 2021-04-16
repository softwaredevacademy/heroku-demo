# Demonstration of Heroku Deployment

Using the mini group project template to showcase deployment with heroku.

**IMPORTANT:** Don't forget to set your backend app's URL in [`frontend/src/api/Api.js`](frontend/src/api/Api.js#L4).

## Quick start

### Spring Backend Application
Assuming you have created a Heroku account, have installed Heroku CLI installed and you are logged in with `heroku login`
 command, in the root folder run

```bash
heroku create
```

Add the database addon

```bash
heroku addons:create heroku-postgresql
```

Push the project to the Heroku repo to start the application build

```bash
git push heroku master
```
**Note:** _If `master` doesn't work, try `main`._

When the build is done, you can visit the app with

```bash
heroku open
```

Make not of the backend app url, which will be needed in the frontend setup.

### React Frontend Application

Set your backend's app URL in [`frontend/src/api/Api.js`](frontend/src/api/Api.js#L4).

Navigate to `frontend` folder and create a git repo and commit
```bash
git init .
git add .
git commit -m "Initial commit"
```

Create the application for frontend on Heroku

```bash
heroku create
```

Push the project to the Heroku repo to start the frontend application build

```bash
git push heroku master
```
**Note:** _If `master` doesn't work, try `main`._

When the build is done, you can visit the frontend app with

```bash
heroku open
```

Have fun!