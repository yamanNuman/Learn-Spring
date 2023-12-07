import './App.css';
import LearningComponent from './components/learn-components/LearnComponens';
import { LearningJavaScript } from './components/learn-components/LearningJavaScript';
function App() {
  return (
    <div className="App">
      My Todo Application
      <LearningComponent />
      <LearningJavaScript />
    </div>
  );
}

export default App;
