import axios from 'axios'

export const apiClient = axios.create(
    {
        //baseURL: 'http://localhost:5000' //#CHANGE
        baseURL: 'http://03-react-java-full-stack-env.eba-ztnnx9gz.eu-central-1.elasticbeanstalk.com/'
    }
);

/* For Best Practices https://facebook.github.io/create-react-app/docs/adding-custom-environment-variables*/
