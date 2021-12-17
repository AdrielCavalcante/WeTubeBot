import styled from 'styled-components';

export const Container = styled.div`
  display: flex;
  flex-direction: column;
  padding: 0 17px;
  background-color: #FF1800;

  nav {
    display: flex;
    align-items: center;
    justify-content: flex-start;
  }

  h3 {
    margin-left: 9px;
    white-space: nowrap;
    font-size: 16pt;
    font-weight: bold;
    color: #FFD800;
  }

  main {
    padding: 1.5em 5em 0 5em;
  }

  h1 {
    font-size: 28pt;
    color: #ffffe4;
    text-align: center;
    font-weight: 900;
    margin-bottom: .75em;
  }

  p {
    font-size: 18pt;
    text-align: justify;
    color: #ffffe4;
    margin-bottom: 1em;
  }

  button {
    font-size: 1em;
    height: 3em;
    border-radius: 12px;
    font-weight: 500;
    background-color: #5865f2;
    color: #fff;
    padding: 0 1em;

    display: flex;
    align-items: center;

    cursor: pointer;
    border: 0;
    transition: .5s;

    svg {
      font-size: 2.5em;
      margin-right: .25em;
    }

    &:hover{
      background-color: #23272a;
    }
  }

  @media(max-width: 500px){
    main {
      padding: 1.5em 0;
    }

    h1 {
      margin-top: .75em;
      font-size: 21pt;
    }

    p {
      font-size: 14pt;
    }

    button {
      margin: .5em auto;
    }
  }


`;